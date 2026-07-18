/*  Find Out number of subarryas in the given array.
       Arr: [4,2,10,3,12,-2,15]
       Output: 28
*/

public class CountAllSubArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,10,3,12,-2,15};
        int count=0;

// Brute-Force Approach:
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i;j<arr.length;j++){       // TC : O(N^2)
    //                 count++;
    //     }
    // }
    
// Optimised Approach:  Using Gauss Theorem

    count = (arr.length*(arr.length+1))/2;       // TC : O(1)
    System.out.println(count);

    }
    
}
