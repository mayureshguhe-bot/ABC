// WAP to display the first 10 natural numbers in reverse order.

package Assignment;
public class Second {
    void print(int num){
        if(num==0)
            return;
        System.out.println(num);
        print(num-1);
    }
    public static void main(String[] args) {
        Second obj = new Second();
        obj.print(10);
    }
}
