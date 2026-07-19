import java.util.Arrays;

public class SumSubArray_B_Optimised1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 1, 3 };
        int[] pfArr = new int[arr.length];

        pfArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) { // TC : O(N)
            pfArr[i] = pfArr[i - 1] + arr[i]; // SC : O(N)
        }
        System.out.println(Arrays.toString(pfArr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {          // TC : O(N^2)
                int sum = 0;                                // Skipped The Third Loop Using Prefix Sum 
                if (i == 0)
                    sum = pfArr[j];
                else
                    sum = pfArr[j] - pfArr[i - 1];

                System.out.println(sum);
            }

        }

    }

}

// Time Complexity: O(N^2) , Space Complexity: O(N)
