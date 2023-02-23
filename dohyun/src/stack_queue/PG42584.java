package stack_queue;

public class PG42584 {

    static  public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            int num = prices[i];

            for(int j=i+1; j<prices.length; j++){
                answer[i]++;
                if(num > prices[j]) break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        prices = solution(prices);

        for(int i=0; i<prices.length; i++){
            System.out.print(prices[i] + ",");
        }
    }
}
