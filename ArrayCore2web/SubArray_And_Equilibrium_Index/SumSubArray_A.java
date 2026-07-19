/* Given an array of size N.
   int[] arr = new int[]{2,4,1,3}

A. Print the sum of every single subarray
B. Print the sum of every single subarray using prefix sum technique. 
C. Print the sum of every single subarray with time complexity O(N) and 
   without using extra space.
*/

public class SumSubArray_A {
    public static void main(String[] args) {
          int[] arr = new int[]{2,4,1,3};
          
   for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
            int sum=0;
         for(int k=i;k<=j;k++){
            sum+=arr[k];
         }
         System.out.println(sum);
      }
   }
    }
    
}

// Time Complexity : O(N^3) , Space Complexity : O(1)  
