package sort;
import java.util.*;

public class PG42748 {
    static public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){

            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2] -1];
        }

        return answer;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                commands[i][j] = sc.nextInt();
            }
        }


        for(int i : solution(array, commands)){
            System.out.print(i + ",");
        }

    }
}
