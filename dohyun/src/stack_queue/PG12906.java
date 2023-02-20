package stack_queue;

import java.util.ArrayList;

public class PG12906 {
        public static int[] solution(int []arr) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int num = -1;

            for(int i=0; i<arr.length; i++){
                if(arr[i] != num){
                    list.add(arr[i]);
                    num = arr[i];
                }
            }

            //일반 배열로 바꾸는 작업
            int answer[] = new int[list.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }

            return answer;
        }

    public static void main(String[] args) {
        int arr[] = {1,1,3,3,0,1,1};

        for (int i : solution(arr)) {
            System.out.print(i);
        }

    }
}
