/* Given an array Arr and element B. Find the minimum no. of swaps
*  required to bring all the elements <=B together.
*  Input: 
*         Arr: [1,12,10,14,3,10,5] , B=8
*  Output: 1
 */

package RecursionCore2web.SlidingWindow;

public class Homework {
    public static void main(String[] args) {
        int[] arr = new int[]{1,12,10,14,3,10,5};
        int b=8;
        int k =0;

        for(int i =0;i<arr.length;i++){         // O(N)
            if(arr[i] <= b)
                     k++;
              }

    int start=0;
    int end = k-1;
    int maxGoodEle=Integer.MIN_VALUE;

while (end < arr.length) {             // O(N-k)
    int goodEle = 0;
    for(int i=start;i<=end;i++){       // O(k)
        if(arr[i] <= b){
            goodEle++;
        }
        if(goodEle>maxGoodEle)
            maxGoodEle=goodEle;
        
}
       start++;
       end++; 
}

int minSwap = k - maxGoodEle;
System.out.println(minSwap);

    }
}

// Time Complexity: O(N + (N-k)*k) == O(N^2)
