package array;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void countFre(String s){

        Map<Character,Integer> map=new HashMap<>();

        if(s.isEmpty()){
            System.out.println("String is empty");
            return ;
        }

    
        for(char c : s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);

        }


        map.forEach((key,object) ->System.out.println(key + " "+ object));



    }
    
    public static void main(String[] args) {
        
       
      
        String s="hhhello";
      

        for(int i =0; i<s.length()-1;i++){
            if(s.charAt(i)!= s.charAt(i+1)){
                System.err.println(s.charAt(i));
                break;
            }
            else{
                i++;
            }
        }




    }
}

