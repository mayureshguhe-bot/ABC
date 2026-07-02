// Better Version than previous

public class Array1_2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };
        int N = 10;
        int count = 0;
        int maxElement = Integer.MIN_VALUE; // maxElement=arr[0] -> Wrong : In companies Minimum value is taken using this
                                            // otherwise
                                            // this code will not be selected
                                            // for maximum integer value: Integer.MAX-VALUE=2147483647
        
        
        for (int i = 0; i < N; i++)          // O(n)
            {
            if (arr[i] > maxElement) {                        
                maxElement = arr[i];                              // Time Complexity: O(n) , Space Complexity: O(1)
            }
        }
        for (int i = 0; i < N; i++)           // O(n)
            {
            if (arr[i] == maxElement) {
                count++;
            }
        }

        System.out.println(N - count);

    }
}
