// WAP to check whether the number is prime or not.

package Assignment;

public class Fifth {
    boolean isPrime(int num, int i) {
        if (num < 2)
            return false;
        if (num == i)
            return true;
        if (num % i == 0)
            return false;

        return isPrime(num, i + 1);

    }

    public static void main(String[] args) {
        Fifth obj = new Fifth();
        int num = 47;
        if (obj.isPrime(num, 2))
            System.out.println(num + " is prime!");

        else
            System.out.println("not a prime");

    }
}
