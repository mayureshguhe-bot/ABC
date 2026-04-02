//Counts thse number of factors| Time Complexity:O(n)

import java.util.*;

public class FindFactors {

    static int factors(int num) {
        int count = 0;
        int itr = 0;
        for (int i = 1; i <= num; i++) {           // TC: O(n)

            itr = itr + 1;

            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(("No. of iterations:"+itr));
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = factors(n);
        System.out.println("No. of roots:"+count);
    }

}