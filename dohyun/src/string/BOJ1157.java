package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] arr = new int[26];

        int max = 0;
        char answer = '?';

        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) >= 97) {
                arr[n.charAt(i) - 97]++;

                if(max < arr[n.charAt(i) - 97]){
                    max = arr[n.charAt(i)-97];
                    answer = (char) (n.charAt(i) - 32); //소문자 계산
                }else if(max == arr[n.charAt(i) - 97]){
                    answer = '?';
                }
            }else{
               arr[n.charAt(i) - 65]++;

               if(max < arr[n.charAt(i) - 65]){
                   max = arr[n.charAt(i) - 65];
                   answer = n.charAt(i);
               }else if(max == arr[n.charAt(i) - 65]){
                   answer = '?';
               }
            }
        }

        System.out.println(answer);
    }
}
