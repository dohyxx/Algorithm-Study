package string;

import java.io.*;
import java.util.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
            // 참고하여 수정

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String word = br.readLine().toUpperCase();

            int[] wordArr = new int[26];

            for(int i=0; i<word.length(); i++){
                    int numChk = word.charAt(i)-65;
                    wordArr[numChk]++;
            }

            int max = -1;
            char result='?';

            for(int j=0; j<wordArr.length;j++){

                if(wordArr[j] > max){
                    max = wordArr[j];
                    result = (char) (j + 65);
                }else if(max == wordArr[j]){
                    result='?';
                }
            }

        System.out.println(result);

    }
}