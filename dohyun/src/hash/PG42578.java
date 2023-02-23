package hash;

import java.util.HashMap;
import java.util.Scanner;

public class PG42578 {
    static public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;

        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1]; //옷의 타입
            map.put(type, map.getOrDefault(type, 0)+1);//타입의 수
        }

        for(String key : map.keySet()){
            answer *= (map.get(key)+1);//상하의 중 하나도 안 입을 수 있는 경우의 수 +1
        }

        return answer-1;
    }
}
