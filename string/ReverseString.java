package string;


public class ReverseString {
    

    public static void main(String[] args) {
        String s="hello welcome";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        char arr[]=s.toCharArray();
        String result;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
         result=new String(arr);
        return result;
}
}
