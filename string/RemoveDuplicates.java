package string;
import java.util.*;

public class RemoveDuplicates {
   public static void  RemoveDuplicate(String s){

      StringBuilder builder=new StringBuilder();
      Set<Character> set =new LinkedHashSet<Character>() ;
      for(char c : s.toCharArray()){
         set.add(c);

      }

      for(char c :set){
         builder.append(c);
      }
    
  System.out.println(builder.toString());
   }

   public static void main(String[] args) {
      String s="naveen  ";
      RemoveDuplicate(s);
   }
}
