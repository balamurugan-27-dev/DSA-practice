package searching;

public class BinarySearch {
    // for binary search the array must be in sorted 
    public static void main(String[] args) {
        int [] arr={1,8,20,22,25,58,96};
        int res=binarySearch(arr,96);
        System.out.println(res);
    }

    public static int binarySearch(int arr[] ,int target){
        
        int mid;
        int left=0;
        int right =arr.length-1;
         
        while(left<=right){
              mid=(right+left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
              }
            else{
            return mid;
            }
        }
        return -1;
    }

}
