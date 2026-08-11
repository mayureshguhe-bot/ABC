package RecursionCore2web;



public class KlenSubarrayCount {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
        int k = 4;
        int count =0;

        int start = 0;    // it is also not needed!
        int end = k-1;
        
        while(end < arr.length){
            count++;

            start++;
            end++;
        }

        System.out.println(count);

    }
}
