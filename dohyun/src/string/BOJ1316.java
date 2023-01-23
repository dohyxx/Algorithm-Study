package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<num; i++){
            if(isGroupString()) count++;
        }
        System.out.println(count);
    }

    public static boolean isGroupString() throws IOException{
        boolean[] arr = new boolean[26];
        int previousChar = 0;
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
                if(ch != previousChar){
                    if(!arr[ch - 'a']){
                        arr[ch - 'a'] = true;
                        previousChar = ch;
                    }else{
                        return false;
                    }
                }
        }
        return true;
    }
}





