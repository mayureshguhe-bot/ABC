// Best Optimised way: Time Complexity- o(√n)

import java.util.Scanner;

public class FindFactors2 {

    static int factors(int num) {
        int itr = 0;
        int count = 0;
        for (int i = 1; i * i <= num; i++) // Instead of i*i=num you can use Math.sqrt() but not the best way best way:i*i<=num
        {
            itr++;
            if (num % i == 0) {
                if (i * i == num) {
                    count = count + 1; // for ex: 10*10,20*20 increase only by one
                } else {
                    count = count + 2; // 2 iterations work in one
                }
            }

        }
        System.out.println("No. of iterations :" + itr);
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No:");
        int n = sc.nextInt();
        int count = factors(n);
        System.out.println("No. of factors: " + count);

    }
}