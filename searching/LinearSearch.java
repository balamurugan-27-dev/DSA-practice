package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={15,1,78,12,11,5};
        int target=12;
        int res=linearSearch(arr,target);
        System.out.println(res);

    }

    public static int linearSearch(int [] arr ,int target){

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
