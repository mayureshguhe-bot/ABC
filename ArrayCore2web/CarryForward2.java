/* Given an integer array of size N.
Build an Array leftMax of size N. leftmax i contains
the maximum from the index 0 to index i.
    Arr : [-3,6,2,4,5,2,8,-9,3,1]
    N : 10
    leftMax : [-3,6,6,6,6,6,8,8,8,8]
 */
// Brute-Force Approach:


public class CarryForward2 {
    public static void main(String[] args) {
        int[] arr= new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N =10;
        int[] leftMax= new int[N];
        
        for(int i=0;i<N;i++){
            int max=Integer.MIN_VALUE;
            
            for(int j=0;j<=i;j++){
                if(arr[j] > max){
                    max=arr[j];
                }
            }
            leftMax[i]=max;
        }
        for(int x:leftMax){
            System.out.print(x+" ");
        }

        
    }
    
}


// Time Complexity : (N(N+1))/2  i.e. O(N^2)
