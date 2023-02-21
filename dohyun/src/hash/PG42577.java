package hash;

import java.util.HashMap;

public class PG42577 {
    static public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        //모든 전화번호를 맵에 넣는다.
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0, j))){
                   return false;
                }
            }
        }

        return true;
    }
}
