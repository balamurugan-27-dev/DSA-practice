package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        

        Set<Integer> ss= new HashSet<>();
        ss.add(1);
        ss.add(1);
        String s="hii";
        
        char []c=s.toCharArray();
        List<Character> l=new LinkedList<>();

        for(int i=0;i<=c.length-1;i++){
            l.add(c[i]);
        }

        System.out.println(l.contains('g'));

    }
}
