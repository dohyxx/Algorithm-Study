package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
//        BufferedReaderader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String word = br.readLine(); "auijiujiu"

        String wordTest = "aAbcDdd";
        String[] wordTestArr = wordTest.toUpperCase().split("");
        String[] wordArr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int count = 0;
        for(int i=0; i<wordTestArr.length;i++){
            for(int j=0; j<wordArr.length; j++){
                if(wordTestArr[i].equals(wordArr[j])){

                    if(map.isEmpty()){
                        map.put(wordTestArr[i],count);
                    }else{
                        count++;
                        if(map.containsKey(wordTestArr[i])) {
                            map.replace(wordTestArr[i], count+1);
                        }else{
                            count = 0;
                            map.put(wordTestArr[i],count);
                        }
                    }

                }
            }
        }

        for(String key : map.keySet()){
            int value = (Integer) map.get(key);
        }

        Integer maxValues = Collections.max(map.values());

        int totCnt = 0;
        String result="";
        for(Map.Entry<String, Integer> entry : map.entrySet()){

            if(entry.getValue() == maxValues){
                totCnt++;
                result = entry.getKey();
            }

            if(totCnt > 1){
                result = "?";
            }

        }
    }
}