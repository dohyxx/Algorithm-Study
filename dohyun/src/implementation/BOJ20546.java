package implementation;

import java.io.*;
import java.util.*;

public class BOJ20546 {
    static int cash;
    static int[] machineDuck = new int[14];
    static int junhyun, sungmin;
    static String answer = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cash = Integer.parseInt(br.readLine());             //현재 가지고 있는 현금
        String[] price = br.readLine().split(" ");   // 14일간 주식 가격
        for(int i=0; i< price.length; i++){
            machineDuck[i] = Integer.parseInt(price[i]);
        }

        junhyun = BNP();
        sungmin = TIMING();

        if(junhyun > sungmin) answer = "BNP";
        else if(junhyun < sungmin) answer = "TIMING";
        else answer = "SAMESAME";

        System.out.println(answer);
    }

    static int BNP(){
        int money = cash;
        int cnt = 0;

        for(int i=0; i< machineDuck.length; i++){
            int now = money / machineDuck[i];
            cnt += now;
            money -= now * machineDuck[i];
        }
        return money + cnt * machineDuck[13];
    }

    static int TIMING(){
        int count = 0; //현재 가지고 있는 주식
        int money = cash;
        int upCnt = 0;
        int downCnt = 0;
        int yesterday = machineDuck[0];

        for(int i=1; i<machineDuck.length; i++){
            int today = machineDuck[i];

            if(today > yesterday){
                upCnt++;
                downCnt = 0;
            }else if(today < yesterday){
                downCnt++;
                upCnt = 0;
            }else{
                upCnt = 0;
                downCnt = 0;
            }

            if(upCnt == 3){
                if(count != 0){
                    money += today * count;
                }
                upCnt = 0;
                count = 0;
            }else if(downCnt == 3){
                int now = money / today;
                count += now;
                money -= now * today;
            }
        }

        return money + count * machineDuck[13];
    }
}
