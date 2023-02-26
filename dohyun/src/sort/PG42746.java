package sort;

import java.util.Arrays;
import java.util.Comparator;

public class PG42746 {

    static public String solution(int[] numbers){
        String answer = "" ;
        String[] result = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            result[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b); //내림차순 정렬 <-> 오름차순 정렬 (a+b).compareTo(a+b)
            }
        });

        if(result[0].equals("0")) return "0"; //만약 numbers가 0일 경우

        for(String str : result) answer += str;

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));
    }
}
