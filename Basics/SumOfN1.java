// Optimised Version-Time Complexity:O(1)

import java.util.Scanner;

public class SumOfN1 {
    static int sum(int num){
        return (num*(num+1))/2;   // Gauss theorem
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number N: ");
        int n=sc.nextInt();
        int ret =sum(n);
        System.out.println(ret);

    }
    
}
