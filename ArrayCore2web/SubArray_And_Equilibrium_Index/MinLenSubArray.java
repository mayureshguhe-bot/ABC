/* 
- Given an integer array of size N.
- Return the length of the smallest subarray which contains both the
  maximum of the array and minimum of the array.

  Input :- A: [1, 2, 3, 1, 3, 4, 6, 4, 6, 3]
  Output :- 4
 */
public class MinLenSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1, 3, 4, 6, 4, 6, 3 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minLen = Integer.MAX_VALUE;
        int len = 0;

        for (int i = 0; i < arr.length; i++) { // TC : O(N)
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) { // TC : O(N)
            if (arr[i] == min) {
                for (int j = i + 1; j < arr.length; j++) { // TC : O(N)
                    if (arr[j] == max) {
                        len = j - i + 1;
                        if (minLen > len) {
                            minLen = len;
                        }
                    }

                }
            } else if (arr[i] == max) {
                for (int j = i + 1; j < arr.length; j++) { // TC : O(N)
                    if (arr[j] == min) {
                        len = j - i + 1;
                        if (minLen > len) {
                            minLen = len;
                        }
                    }

                }
            }
        }
        System.out.println(minLen);

    }

}

// Time Complexity : O(N^2)