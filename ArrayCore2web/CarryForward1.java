/* Program to find maximum element in array upto user given index 
   means suppose user give i=3 the find maximum element in the
   array from arr[0] to arr[3].
 */

   import java.util.*;

public class CarryForward1 {
    public static void main(String[] args) {
        /*INPUT:
        int[] arr = newe int[] {3,4,5,1,2,7,9,8};
        int n = 8;
        int k=3;
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){               // TC: O(n)
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the index upto which you want Sum: ");
        int k =sc.nextInt();
        int sum=0;
        for(int j=0;j<=k;j++){              // TC : O(k)
            sum+=arr[j];
        }

        System.out.print("Sum: "+sum);
    }
    
}


// Total Time Complexity : O(n) + O(k) or O(N)
// Space Complexity : O(1)