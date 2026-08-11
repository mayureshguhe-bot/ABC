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
 
// Brute-Force Approach :-

import java.util.*;

public class PrefixSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        // int N = 10;
        // int Q = 3;
         
        System.out.println("Enter the size of Array:");
        int N = sc.nextInt();
        int[] arr= new int[N];
        System.out.println("Enter the array elements: ");
          for(int k=0;k<N;k++){
            arr[k]=sc.nextInt();
          }

        System.out.println("Enter the no. of queries:  ");
        int Q=sc.nextInt();
        
        for (int i = 1; i <= Q; i++) {        // TC : O(Q)        
            int sum = 0;
            System.out.println();
            System.out.println("query "+i+":");
            System.out.print("Enter start index: ");
            int s = sc.nextInt();
            System.out.print("Enter end index: ");
            int e = sc.nextInt();

            for (int j = s; j <= e; j++) {      // O(N): Worst Case when user entered s=0 and e=N-1(Full Array)
                sum = sum + arr[j];
            }
            System.out.println("Sum = " + sum);
        }
        sc.close();

    }

}

//  Time Complexity: O(Q*N) not O(N^2)