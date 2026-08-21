// WAP to print the sum of n natural numbers.

package Assignment;

public class Third {
    int sum(int num){
        if(num==0)
            return 0;
    return num + sum(num-1) ;
    }
    public static void main(String[] args) {
        Third obj = new Third();
        int ret = obj.sum(5);
        System.out.println(ret);
    }
}
