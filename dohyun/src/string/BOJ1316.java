package string;

import java.util.Scanner;
public class BOJ1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = num;

        for(int c = 0;c<num;c++) {
            String str = sc.next();
            boolean arr[] = new boolean[26];

            for(int i=0; i<str.length()-1; i++) {
                if(str.charAt(i) != str.charAt(i+1)) {
                    if(arr[str.charAt(i+1)-97] == true) {
                        cnt--;
                        break;
                    }
                }
                arr[str.charAt(i) - 97]=true;
            }
        }
        System.out.println(cnt);
    }
}




