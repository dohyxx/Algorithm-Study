package brute_force;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class BOJ1018 {

    static char[][] board;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        board = new char[n][m];
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < board.length; i++) {
            String s = br.readLine();

            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = s.charAt(j);
            }
        }


        for(int i=0; i<n-7; i++){
            for(int j=0; j<m-7; j++){
                answer = Math.min(answer, solution(i, j));
            }
        }
        System.out.println(answer);

    }

    public static int solution(int x, int y){
        int white = 0;
        int black = 0;

        for(int i= x; i < x+8; i++){
            for(int j=y; j < y+8; j++){
                if((i+j) % 2 == 0){
                    if(board[i][j] == 'B') white++;
                    else black++;
                }else{
                    if(board[i][j] == 'W') white++;
                    else black++;
                }
            }
        }

        return Math.min(white, black);
    }
}
