/* More Optimised Version : Sliding Window(we are just sliding fixed size subarray(window) forward.)
* [[-3, [4, -2, 5], 3], -2, 8, 2, 1, 4]
*          |_>repeating window(Fixed size subarray)
*   -3+4+(-2)+5= 4 , 4+(-2)+5+3= 10
*    instead of: sum - arr[1st] + arr[last of second subarray]
*                   4 - (-3) + 3 = 10
*/
package RecursionCore2web.SlidingWindow;

public class MaxSubarraySumLenKOptimised_SlidingWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
        int k =4;

        int start = 0;
        int end=k-1;

        int sum = 0;
        for(int i = start;i<=end;i++){      // O(k)
            sum+=arr[i];
        }

         start = 1;
         end = k;
         int maxEle = Integer.MIN_VALUE;

        while(end<arr.length){                          // O(N-k)
            sum = sum - arr[start-1] + arr[end];

            if(sum>maxEle){
                maxEle = sum;
            }
            start++;
            end++;
        }

        System.out.println(maxEle);

    }
    
}

// Time Complexity: O(k + N - K) == O(N)
// Space Complexity: O(1)