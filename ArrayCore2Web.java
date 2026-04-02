/* Given an array of size N.
  Count the no. of element having at least 1 element greater than itself
  Example Input : arr=[2,5,1,4,8,0,8,1,3,8] , N=10 
        output: 7
*/
import java.util.*;
class ArrayDemo{
    public static void main(String[] args) {
        // int[] arr =new int[]{2,5,1,4,8,0,8,1,3,8};
        // int N=10;
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int N=sc.nextInt();
        int arr[]=new int[N];
          for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
          }
      int  count=0;

        for(int i=0;i<N;i++)       // O(n)
            {                                       // Time Complexity: O(n)*O(n)=O(n^2)
            for(int j=0;j<N;j++)   // O(n)
                {
                if(arr[i]<arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}