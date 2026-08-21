// WAP to check whether the given number is palindrome or not.

package Assignment;

public class Tenth {

    int reverse(int num,int temp){
        if(num==0)
            return temp;
    // Stores the num in reverse order:
        temp= temp*10 + num%10;
        return reverse(num/10,temp);
    }
    public static void main(String[] args) {
        Tenth obj = new Tenth();
        int temp=0;
        int num =12321;
        
        if(obj.reverse(num,temp)==num)
            System.out.println(num+" is a Palindrome!");
        else
            System.out.println(num+" is not a Palindrome!");

    }   
}
