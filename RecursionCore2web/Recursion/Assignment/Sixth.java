package Assignment;

public class Sixth {
    int sumOfDigit(int num){
        if(num==0)
            return 0;
        return num%10 + sumOfDigit(num/10);
    }
    public static void main(String[] args) {
        Sixth obj = new Sixth();
        int ret =obj.sumOfDigit(456);
        System.out.println(ret);
    }
}
