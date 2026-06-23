package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatChar {
    public static void firstNonRepeatChar(String s){

        char[] arr =s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        
        for(char c : arr){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
  
        for(char i : arr){
            if(map.get(i)==1){
                System.out.println(i);
                return;
            }
        }

    }
    public static void main(String[] args) {
        String s ="leetcode";
        firstNonRepeatChar(s);
    }
}
