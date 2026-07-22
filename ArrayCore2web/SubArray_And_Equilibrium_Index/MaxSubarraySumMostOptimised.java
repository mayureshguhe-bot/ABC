/*   ##  Kadane's Algorithm  ##
  Step 1> sum = sum + arr[i]
  Step 2> maxSum = sum ....if sum > maxSum
  Step 3> sum=0 ... if sum < 0
 */

public class MaxSubarraySumMostOptimised {
    public static void main(String[] args) {
        int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > maxSum)
                maxSum = sum;

            if (sum < 0)
                sum = 0;
        }
        
        System.out.println(maxSum);
        System.out.println(sum);
    }
}

// Time Complexity : O(N) , Space Complexity :O(1)