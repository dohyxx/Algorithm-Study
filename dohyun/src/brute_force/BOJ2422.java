package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class BOJ2422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        //섞어먹으면 안 되는 조합
        boolean[][] group = new boolean[n+1][n+1];//6,6 이차원배열
        for(int i=0; i<m; i++){
            strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);

            group[a][b] = true;
            group[b][a] = true;
        }

        int result = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                if(group[i][j]) continue;
                for(int k = j+1; k <= n; k++){
                    if(!group[j][k] && !group[k][i]) result++;
                }
            }
        }

        System.out.println(result);


    }
}
