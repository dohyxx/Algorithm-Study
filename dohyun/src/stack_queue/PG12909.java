package stack_queue;

public class PG12909 {
    static boolean solution(String s) {
        int num = 0;
        int num2 = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '('){
                num++;
            }else if(s.charAt(i) == ')'){
                num2++;
            }
            if(num < num2){
                return false;
            }
        }

        if(num == num2) return true;

        return false;
    }

    public static void main(String[] args) {

        System.out.print(solution(")()("));
    }
}
