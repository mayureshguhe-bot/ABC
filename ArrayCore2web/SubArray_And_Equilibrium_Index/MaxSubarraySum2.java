public class MaxSubarraySum2 {
    public static void main(String[] args) {
        int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] pfArr = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        pfArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pfArr[i] = pfArr[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if (i == 0)
                    sum = pfArr[j];
                else
                    sum = pfArr[j] - pfArr[i - 1];

                if (sum > maxSum) {
                    maxSum = sum;
                }

            }

        }
        System.out.println(maxSum);
    }

}

// Time Complexity : O(N^2) , Space Complexity : O(N)