/* NOW,
    Don't print the sum. Print the subarray itself whose sum is maximum.
 */

public class PrintMaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int startIdx = -1, endIdx=-1;
    for(int i=0; i<arr.length;i++){
        sum = sum + arr[i];

        if(sum > maxSum){
            maxSum = sum;
            endIdx = i;
        }

        if(sum<0){
            sum=0;
            startIdx = i;
        }
    }
    System.out.println(maxSum);

    for(int i= startIdx +1;i<=endIdx;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
    
}

// Time Complexity : O(N) , Space Complexity : O(1)
