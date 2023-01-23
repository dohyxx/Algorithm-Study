package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String input = br.readLine();
         Integer[] arr = new Integer[input.length()];

         for(int i=0; i<input.length(); i++){
             arr[i] = Character.getNumericValue(input.charAt(i));
         }
        Arrays.sort(arr, Collections.reverseOrder());//내림차순 정렬

        for (Integer result : arr) {
            System.out.print(result);
        }

    }
}
