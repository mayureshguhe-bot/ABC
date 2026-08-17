public class RecursionTypes {

    void tail(int n){
        if(n==0)
            return;
    System.out.println(n);
    tail(--n);  // Tail Recursion: Function call is the last statement.
    }

    void nonTail(int n){
        if(n==0)
            return;
        nonTail(--n);
        System.out.println(n);
    }
    public static void main(String[] args){
    System.out.println("TAIL RECURSION:-");
        System.out.println("Start Main");
        RecursionTypes obj = new RecursionTypes();
        obj.tail(2);
        System.out.println("End Main");

    System.out.println("NON-TAIL RECURSION:-");
        System.out.println("Start Main");
        RecursionTypes obj1 = new RecursionTypes();
        obj1.nonTail(2);
        System.out.println("End Main");



    }
    
}
