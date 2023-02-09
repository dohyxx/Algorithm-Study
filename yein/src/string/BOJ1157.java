package string;

import java.io.*;
import java.util.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String word = br.readLine();
            String[] wordTestArr = word.toUpperCase().split("");
            String[] wordArr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

            HashMap<String, Integer> map = new HashMap<String, Integer>();

            for(int i=0; i<wordTestArr.length;i++){
                for(int j=0; j<wordArr.length; j++){
                    if(wordTestArr[i].equals(wordArr[j])){
                        if (map.containsKey(wordTestArr[i])) {
                            map.replace(wordTestArr[i], (map.get(wordTestArr[i])+1));
                        }else{
                            map.put(wordTestArr[i],1);
                        }
                    }
                }
            }

            for(String key : map.keySet()){
                int value = (Integer) map.get(key);
            }

            Integer maxValues = Collections.max(map.values());

            int totCnt = 0;
            String result="?";
            for(Map.Entry<String, Integer> entry : map.entrySet()){

                if(entry.getValue().equals(maxValues)){
                    totCnt++;
                    result = entry.getKey();
                }

            }

            if(totCnt > 1){
                result = "?";
            }

            System.out.println(result);
    }
}