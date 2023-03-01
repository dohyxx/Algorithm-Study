package brute_force;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ7568 {
    public static int[] solution(int[][] person){
        int[] answer = new int[person.length];

        for(int i=0; i<person.length; i++){
            int rank = 1;
            for(int j=0; j<person.length; j++) {

                if(i == j) continue; //같은 사람은 비교할 필요 없음

                if(person[i][0] < person[j][0] && person[i][1] < person[j][1]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] person = new int[n][2];

        String[] input;
        for (int i = 0; i < person.length; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < person[i].length; j++) {
                person[i][0] = Integer.parseInt(input[0]);  //몸무게
                person[i][1] = Integer.parseInt(input[1]);  //키
            }
        }


        for(int i : solution(person)){
            System.out.print(i + " ");
        }
    }
}
