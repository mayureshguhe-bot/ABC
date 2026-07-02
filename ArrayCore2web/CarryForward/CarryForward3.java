/* Given an integer array of size N.
Build an Array leftMax of size N. leftmax i contains
the maximum from the index 0 to index i.
    Arr : [-3,6,2,4,5,2,8,-9,3,1]
    N : 10
    leftMax : [-3,6,6,6,6,6,8,8,8,8]
 */
// Optimised Approach:


public class CarryForward3 {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int n=10;
        int leftMax[] = new int[n];

        leftMax[0]=arr[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Integer.max(leftMax[i-1], arr[i]);                // TC: O(n)
            // if(arr[i]>leftMax[i-1]){
            //     leftMax[i]=arr[i];
            // }
            // else{
            //     leftMax[i]=leftMax[i-1];
            // }
        }

        for(int x:leftMax){
            System.out.print(x+" ");
        }
    }
    
}

// Optimised Time Complexity: O(n)