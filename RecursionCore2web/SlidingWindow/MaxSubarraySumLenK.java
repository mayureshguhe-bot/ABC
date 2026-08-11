package RecursionCore2web.SlidingWindow;

/* Given an array of size N.Find the maximum subarray sum of length k.
     Input : [-3,4,-2,5,3,-2,8,2,1,4]
     k : 4
     Output : 15
 */

public class MaxSubarraySumLenK {
    public static void main(String[] args) {
        int[] arr = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int k = 4;

        int start = 0;
        int end = k - 1;
        int maxEle = Integer.MIN_VALUE;

        while (end < arr.length) {            // O(N-k)
            int sum = 0;

            for (int i = start; i <= end; i++) {     // O(N)
                sum += arr[i];
            }
            if (sum > maxEle)
                maxEle = sum;

            start++;
            end++;

        }
        System.out.println(maxEle);
    }
}

/*  Time Complexity: O((N-k)*N) == O(N^2)
*   Space Complexity: O(1)
*/