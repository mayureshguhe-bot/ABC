


/*
-You are given an array A of integers of size N.
-Your task is to find the equilibrium index of the given array.
-The equilibrium index of an array is an index such that the sum of elements at lower 
indexes is equal to the sum of elements at higher indexes.
-If there are no elements that are at lower indexes or at higher indexes, then the corresponding
sum of elements is considered as 0.

Note:
- Array indexing Starts from zero.
- If there are no equilibrium index then return -1.
- If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints:
1 <= N <= 105
-105 <= A[i] <= 105

Example Input:   1) A= [-7,1,5,2,-4,3,0]
                 2) A= [1,2,3]

Example Output:  1) 3   (Actually are index 3 and 6 but min(3))
                 2) -1
 */

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr =new int[]{-7,1,5,2,-4,3,0};
        int flag=0;

    for(int i=0;i<arr.length;i++){           // TC : O(N)
        int leftSum=0;
        int rightSum=0;

        for(int j=0;j<i;j++){           // TC : O(N)
            leftSum+=arr[j];                        
        }                                   // Combined TC : O(2N)
                                                       
        for(int j=i+1;j<arr.length;j++){     // TC : O(N)
            rightSum+=arr[j];
        }

        if(leftSum==rightSum){
            flag=1;
            System.out.println(i);
            break;
        }

    }
    if(flag==0){
        System.out.println("-1");
    }
    }
    
}

// Time Complexity: O(N^2)