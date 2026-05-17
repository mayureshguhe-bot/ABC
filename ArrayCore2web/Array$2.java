/*  Given an array of size N.
   Reverse the array without using extra space.   space complexity : O(1)
   arr : [8,4,1,3,9,2,6,7]
   output: [7,6,2,9,3,1,4,8] 
*/
import java.util.*;

public class Array$2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of the array: ");
        int N= sc.nextInt();
         int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        // int[] arr = new int[] { 8, 4, 1, 3, 9, 2, 6, 7 };
        // int N = 8;
        int i = 0;
        int j = N- 1;

        while (i < j) {              // itr : N/2 
            int temp = arr[i];       // Time Complexity :O(n) ,  Space complexity : O(1)
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        System.out.println(Arrays.toString(arr));
    }
}
