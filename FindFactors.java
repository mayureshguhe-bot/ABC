//Counts thse number of factors

import java.util.*;

public class FindFactors {

    static int factor(int num) {
        int count = 0;
        int itr = 0;
        for (int i = 1; i <= num; i++) {

            itr = itr + 1;

            if (num % i == 0) {
                count++;
            }
        }
        System.out.println((itr));
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = factor(n);
        System.out.println(count);
    }

}