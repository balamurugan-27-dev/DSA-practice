package array;
public class TwoSum {
   public static void main(String[] args) {
     int[] arr={1,7,9,8,2,6};
    int result[]=findfTwosum(arr,11);
      
    for(int res:result){
      System.out.println(res);
    }
   
   }

   private static int[] findfTwosum(int arr[],int target ) {
      
      if(target<=1 || arr.length==0){
         return new int[]{-1};
      }

      for(int i=0;i<arr.length;i++){

         for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
               return new int[]{i,j};
            }
         }
      }
    
    return new int[]{-1,-1,};
   }
}
