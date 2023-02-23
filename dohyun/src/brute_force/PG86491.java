package brute_force;
import java.util.*;

public class PG86491 {
    static public int solution(int[][] sizes){
        int max_w = 0;
        int max_h = 0;

        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]); //가장 큰 사이즈 = 가로
            int h = Math.min(sizes[i][0], sizes[i][1]); //가장 작은 사이즈 = 세로

            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }

        return max_w * max_h;
    }
}
