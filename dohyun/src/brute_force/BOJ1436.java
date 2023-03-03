package brute_force;
import java.io.*;

public class BOJ1436 {
    public static int solution(int titleNumber){
        int answer = 0;

        while(titleNumber > 0){
            answer++;

            if(Integer.toString(answer).contains("666")){
                titleNumber--;
            }
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int titleNumber = Integer.parseInt(br.readLine());

        System.out.println(solution(titleNumber));
    }
}


