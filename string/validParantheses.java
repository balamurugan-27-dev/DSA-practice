package string;

import java.util.Stack;

public class validParantheses {
    public static boolean valid(String s){

        char arr[]=s.toCharArray();
        Stack <Character> stack=new Stack<>();

        for(int i=0;i<=arr.length-1;i++){

            if(arr[i]=='{' ||  arr[i]=='[' || arr[i]=='(' ){
                stack.push(arr[i]);
            }

            else{

                if(stack.isEmpty()){
                    return true;
                }
                char top=stack.pop();

                if((arr[i]== ')' && top !='(' ||
                    arr[i]=='}' && top != '{' ||
                    arr[i]==']' && top != '[' )){

                        return false;
                    }
                }
    }
     return stack.isEmpty();
}
    public static void main(String[] args){
                String s="{{}";

            System.out.println(valid(s));
    }
}
