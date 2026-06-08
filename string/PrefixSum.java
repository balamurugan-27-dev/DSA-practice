package string;

public class PrefixSum {

    public static void main(String[] args) {

        String []  arr={"lite","limit","liter"};

        String ans=findComPrefix(arr);

        System.out.println(ans);
    }

    private static String findComPrefix(String[] arr) {
        
        String pre=arr[0];

        for(int i=1;i<=arr.length-1;i++){

            while(!arr[i].startsWith(pre)){

                pre=pre.substring(0,pre.length()-1);

            }
             if(pre.isEmpty())
            return "";
        }

         return pre;

    }

  

}
