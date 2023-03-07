package brute_force;

import java.io.*;

public class BOJ15721 {
    static int a,t,k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine()); //전체 인원(0부터 a-1까지)
        t = Integer.parseInt(br.readLine()); //t번째 k를 외치는 사람
        k = Integer.parseInt(br.readLine()); // 0 = 뻔, 1 = 데기

        System.out.println(solution());
    }

        static int solution(){
            int count = 2;
            int bbun = 0;
            int degi = 0;

            while(true){
                //처음 '뻔-데기-뻔-데기' 카운트
                for(int i=0; i<4; i++){
                    if(i%2==0){
                        bbun++;
                    }else{
                        degi++;
                    }

                    if(bbun == t && k == 0) return (bbun+degi-1) % a;
                    if(degi == t && k == 1) return (bbun+degi-1) % a;
                }

                //이후 뻔 X n - 데기 X n 카운트
                for(int i=0; i<count; i++){
                    bbun++;
                    if(bbun == t && k == 0) return (bbun+degi-1) % a;
                }

                for(int i=0; i<count; i++){
                    degi++;
                    if(degi == t && k == 1) return (bbun+degi-1) % a;
                }

                count++;
            }
    }
}
