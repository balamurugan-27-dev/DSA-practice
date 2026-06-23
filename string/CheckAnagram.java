package string;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    public static boolean checkAnagram(String s , String t){
        Map<Character,Integer>map1=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();
        for(char c: s.toCharArray()){
            map1.put(c,map1.getOrDefault(c, 0)+1);
        }
          for(char c: t.toCharArray()){
            map2.put(c,map2.getOrDefault(c, 0)+1);
        }
        return map1.equals(map2);
    
    }
    public static void main(String[] args) {
        
        System.out.println(checkAnagram("apple", "pplea"));
    }
}
