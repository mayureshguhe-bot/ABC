// Importance of return type
public class Recursion1 {
    // void fun(int n){
    //     if(n==0)
    //         return ;
    //     n = 5 + fun(--n);      // We cannot do this because how to add 5(int)+void?
    //     System.out.println(n);
    // }

// Instead
        int fun(int n){
            if(n==0)
                return 1;
            n = 5 + fun(--n); // Last call here is addition not function call i.e. Non-Tail 
            return n;
        }
    public static void main(String[] args) {
        System.out.println("Start Main");
        Recursion1 obj = new Recursion1();
        int ret = obj.fun(2);
        System.out.println(ret);
        System.out.println("End Main");
    }
}
