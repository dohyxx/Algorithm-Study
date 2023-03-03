package priorityQueue;
import java.util.*;

/**
 * 우선순위 큐
 */
public class PG42587 {

    static public int solution(int[] priorities, int location) {
        int answer = 0;
        //1. 큰 수가 우선순위를 갖는 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //2. priorities 값을 우선순위 큐에 담는다.
        for (int i : priorities) {
            pq.add(i);
        }

        //3.우선순위 큐가 빌 때까지 반복
        while (!pq.isEmpty()) {

            for (int i = 0; i < priorities.length; i++) {

                //4.값만 일치하는 경우 해당 문서 출력
                if (pq.peek() == priorities[i]) {
                    pq.poll(); //첫번째 목록 큐에서 제거
                    answer++;

                    // 6. 값과 위치가 모두 일치하면 answer을 반환.
                    if (location == i) return answer;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};

        System.out.println("answer: "+ solution(priorities, 0));
    }
}
