/* /* Given an integer array of size N.
Build an Array rightMax of size N. rightmax i contains
the maximum from the index i to index N-1.
    Arr : [-3,6,2,4,5,2,8,-9,3,1]
    N : 10
    rightMax : [8,8,8,8,8,8,8,3,3,1]
 */


public class CarryForward4 {
    public static void main(String[] args) {
           int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int n=10;
        int rightMax[] = new int[n];

        rightMax[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(rightMax[i+1]<arr[i]){
                rightMax[i]=arr[i];
            }
            else{
                rightMax[i]=rightMax[i+1];
            }
        }
        for(int x: rightMax){
            System.out.print(x+" ");
        }
    }
}
