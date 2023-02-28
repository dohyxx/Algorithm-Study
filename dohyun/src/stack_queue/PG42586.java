package stack_queue;
import java.util.*;

public class PG42586 {

    //문제 풀이 1
    // 큐 사용
    static public int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i=0; i<progresses.length; i++){
            double remain = ((100 - progresses[i]) / (double) speeds[i]);
            int date = (int) Math.ceil(remain); //남은 날짜 올림 처리

            //앞,뒤 남은 날짜 비교.
            //기존 큐에 있던 값이 더 작으면 배포일에 추가한다.
            if(!queue.isEmpty() && date >= queue.peek()){
                answerList.add(queue.size());
                queue.clear();
            }
            queue.offer(date);
        }

        answerList.add(queue.size());


        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }


    //문제 풀이 2
    //배열 사용
    static public int[] solution2(int[] progresses, int[] speeds){
        int[] dayOfend = new int[100];
        int day = -1;

        for(int i=0; i<progresses.length; i++){
            while (progresses[i] + (day*speeds[i]) < 100){
                day++;
            }
            dayOfend[day]++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : dayOfend){
            if(i != 0) list.add(i);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }


        public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        for(int i : solution(progresses,speeds)){
            System.out.print(i);
        }
    }
}
