/* Given an array of size N and Q number of queries. 
      Query contains two parameters (s,e).
            s-> Start index
            e-> End index
For all queries, print sum of all elements from index s to e.
    arr : [-3,6,2,4,5,2,8,-9,3,1]
    N : 10
    Q : 3
    
    Queries    s      e        sum
    query 1:   1      3         12                                  
    query 1:   2      7         12
    query 1:   1      1         6
       */

// Optimised :- Same problem but optimised solution

import java.util.*;

public class PrefixSum2 {
    public static void main(String[] args) {
        // int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        // int N = 10;
        // int Q = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter array elements:");
        for (int k = 0; k < N; k++)               // TC : O(N)
            arr[k] = sc.nextInt();

        System.out.println("Enter no. of queries:");
        int Q = sc.nextInt();

        int[] psArr = new int[N];
        psArr[0] = arr[0];

        for (int i = 1; i < N; i++) {             // TC : O(N)
            psArr[i] = psArr[i - 1] + arr[i];
        }

        int sum = 0;
        for (int j = 1; j <= Q; j++) {            // TC : O(Q)    
             System.out.println("Enter start index : ");
            int start = sc.nextInt();
            System.out.println("Enter end index : ");
            int end = sc.nextInt();

            if (start == 0)
                sum = psArr[end];
            else
                sum = psArr[end] - psArr[start - 1];

            System.out.println("Sum:" + " " + sum);

        }
        sc.close();
    }

}

// Time Complexity : O(Q+N) or O(N)      Space Complexity:O(1)