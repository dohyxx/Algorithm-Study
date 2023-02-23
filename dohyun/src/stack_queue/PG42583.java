package stack_queue;

import java.util.*;

public class PG42583 {
    static public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();

        int sum = 0;    //다리에 올라간 트럭 무게
        int time = 0;   //건너는 최종 시간

        for(int i=0; i<truck_weights.length; i++){
            int truck = truck_weights[i];

            while (true){
                if(queue.isEmpty()){ // 1.다리에 트럭이 하나도 없을 경우
                    queue.add(truck);
                    sum += truck;
                    time++;
                    break;
                }
                else if(queue.size() == bridge_length){ // 2.다리에 트럭이 모두 올라간 경우
                    sum -= queue.poll();
                }
                else{ // 3.다리에 트럭이 1대 올라간 경우
                    if(sum + truck <= weight){ //올라 갈 수 있는 무게보다 적을 때만 add
                        queue.add(truck);
                        time++;
                        sum += truck;
                        break;
                    }else{ //허용 무게보다 큰 경우 0 추가
                        queue.add(0);
                        time++;
                    }
                }
            }
        }


        return time + bridge_length;
    }


    public static void main(String[] args) {
        int[] truck = {7, 4, 5, 6};
        System.out.println(solution(2, 10, truck));
    }
}
