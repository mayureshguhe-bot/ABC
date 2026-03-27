import java.util.Scanner;

public class SumOfN {
    static int sum(int num){
        int add=0;
        int itr=0;
      for(int i=1;i<=num;i++){
        itr++;    
        add=add+i;
      }
       
System.out.println("No. of iterations: "+itr);
    return add;

      }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number N: ");
        int n=sc.nextInt();
        int ret = sum(n);
        System.out.println("Sum of N numbers: " +ret);
    }
    
}
