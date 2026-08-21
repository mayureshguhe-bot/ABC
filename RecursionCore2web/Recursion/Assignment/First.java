// WAP to print the numbers between 1 to 10.

package Assignment;

public class First {

    void print_1to10(int num){
        if(num==0)
            return;
        print_1to10(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        First obj = new First();
        obj.print_1to10(10);
    }
}
