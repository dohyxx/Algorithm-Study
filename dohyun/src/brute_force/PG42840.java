package brute_force;

import java.util.ArrayList;

public class PG42840 {
    static public int[] solution(int[] answer){
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for(int i=0; i<answer.length; i++){
            if(answer[i] == user1[i%user1.length]) cnt1++;
            if(answer[i] == user2[i%user2.length]) cnt2++;
            if(answer[i] == user3[i%user3.length]) cnt3++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int max = Math.max(Math.max(cnt1, cnt2), cnt3); //최대 값 구하기
        if(max == cnt1) list.add(1);
        if(max == cnt2) list.add(2);
        if(max == cnt3) list.add(3);

        int[] result = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};

        for(int i : solution(answer)) System.out.print(i);
    }
}
