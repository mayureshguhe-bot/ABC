public class SumOfDigit_Recursion {

    // Custom logic:
    int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Using Recursion
    int sum1 = 0; // Global Variable

    int sum1(int n) {
        if (n == 0)
            return 0;
        sum1 = sum1 + n % 10;
        sum1(n / 10);
        return sum1;
    }

    // Using Recursion: But without using sum
    int sum2(int n) {
        if(n==0)
            return 0;
        return n % 10 + sum2(n / 10);
    }

    public static void main(String[] args) {
        SumOfDigit_Recursion obj = new SumOfDigit_Recursion();
        int ret = obj.sum(123);
        int ret1 = obj.sum1(123);
        int ret2 = obj.sum2(123);
        System.out.println(ret);
        System.out.println(ret1);
        System.out.println(ret2);
    }
}
