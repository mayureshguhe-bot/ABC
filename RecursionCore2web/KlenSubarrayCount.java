/* Count the number of subarray for a fixed length k.
     Input : [-3,4,-2,5,3,-2,8,2,1,4]
     k : 4
     Output: 7
*/

public class KlenSubarrayCount {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
        int k = 4;
        int count =0;

        int start = 0;
        int end = k-1;
        
        while(end < arr.length){
            count++;

            start++;
            end++;
        }

        System.out.println(count);

    }
}
