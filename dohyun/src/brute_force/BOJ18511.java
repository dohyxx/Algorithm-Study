package brute_force;

import java.io.*;
public class BOJ18511 {
    static int n,k;
    static int[] arr;
    static int max = 0;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); //n 원소
        k = Integer.parseInt(input[1]); //k 원소 개수

        input = br.readLine().split(" ");
        arr = new int[k];

        // k 원소
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        dfs(0,0);
        System.out.println(max);
    }

    static void dfs(int cnt, int num){
        if(cnt == 8){
            return;
        }

        num *= 10;
        System.out.println(num);
        if(num >= n) return;

        for(int i=0; i<k; i++){
            int temp = num + arr[i];
            if(temp > n) continue;
            if(temp > max) max = temp;
            dfs(cnt+1, temp);
        }
    }
}


