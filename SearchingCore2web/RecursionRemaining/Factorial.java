package SearchingCore2web.RecursionRemaining;

public class Factorial {

// Using For Loop:
    int fact(int num){
        int f=1;
        for(int i =1;i<=num;i++){
            f=f*i;
        }
        return f;
    }

// Using Recursion
    int factR(int num){
        if(num==0)
            return 1;
        return num * factR(num-1);
    }
    public static void main(String[] args) {
       Factorial obj =new Factorial();
        int ret = obj.fact(2);
        int ret1 = obj.factR(2);
        System.out.println(ret);
        System.out.println(ret1);
    }
}
