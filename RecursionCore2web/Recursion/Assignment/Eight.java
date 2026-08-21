// WAP to count occurence of a specific digit in a given number.

package Assignment;

public class Eight {
    int specificDigitCount(int num,int digit){
        if(num == 0)
            return 0;
        if(num%10==digit){
            return 1+specificDigitCount(num/10, digit);
        }
        
         return  specificDigitCount(num/10, digit);
        

    }
    public static void main(String[] args) {
        Eight obj = new Eight();
        int ret = obj.specificDigitCount(12334522,2 );   // Small edge case not handeled (0,0)
        System.out.println(ret);
    }
}
