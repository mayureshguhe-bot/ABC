public class TotalSumSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 1, 3 };

        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                totalSum+=sum;
                System.out.println(sum);
            }
            
        }
        System.out.println(totalSum);

    }
    
}

// Time Complexity : O(N^2)
