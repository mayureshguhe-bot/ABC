// WAP to print numbers from 1 to 10 using 1)for loop then 2)recursion.

//package RecursionCore2web.Recursion;

public class NumberPrint {

// Using for loop
    // void numPrint(int n){
    //     for(int i =1;i<=n;i++){
    //         System.out.println(i);
    //     }
    // }

// Using Recursion
       void numPrint(int n){
            if(n==0){
                return;
            }
             //numPrint(n--);  //Causes Stack Overflow error
            numPrint(n-1);
        System.out.println(n);
       }



    public static void main(String[] args) {
        NumberPrint obj = new NumberPrint();
        obj.numPrint(10);
    }
}
