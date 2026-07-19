
public class SumSubArray_C_Optimised2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {             // TC : O(N^2)
                 sum = sum + arr[j];

                System.out.println(sum);                       // SC : O(1)
            }

        }

    }

}

// Time Complexity: O(N^2) , Space Complexity: O(N)
