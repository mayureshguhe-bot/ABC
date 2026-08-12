package RecursionCore2web.SlidingWindow;
/* Scenario : -3 + 4 + (-2) + 5       Noticed that we are doing sum again and again.
*              4 + (-2) + 5 + 3       -3+4+(-2)+5 then again 4+(-2)+5+3 
*             -2 + 5 + 3 + -2          Therefore, Prefix Sum
 */

public class MaxSubarraySumLenKOptimised1 {
    public static void main(String[] args) {
        int[] arr = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int k = 4;
        int[] pfArr = new int[arr.length];

        pfArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {         // TC: O(N) , SC: O(N)
            pfArr[i] = pfArr[i - 1] + arr[i];
        }

        int start = 0;
        int end = k - 1;
        int maxEle = Integer.MIN_VALUE;

        while (end < arr.length) {                     // TC : O(N-k)
            int sum = 0;
            if (start == 0)
                sum = pfArr[end];
            else
                sum = pfArr[end] - pfArr[start - 1];

            if (sum > maxEle)
                maxEle = sum;

            start++;
            end++;

        }

        System.out.println(maxEle);
    }
}
/* Time Complexity : O(N+N-K) == O(N) 
*  Space Complexity : O(N)
*/