// A more Optimised Way

import java.util.Scanner;

public class FindFactors1 {

    static int factors(int num) {
        int itr = 0;
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {

            itr++;

            if (num % i == 0) {
                count++;
            }
        }
           System.out.println(("No. of iterations:"+itr));
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        int count = factors(n);
        System.out.println("No. of roots:"+count);
    }

}
