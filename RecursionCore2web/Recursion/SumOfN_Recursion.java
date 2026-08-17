public class SumOfN_Recursion {

// Using For-Loop:-
    int add(int n){
        int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    return sum;
    }

// Using Recursion:-
    int addR(int n){
        if(n==0)
            return 0;
        n = n + addR(--n);
        return n;
    }
    public static void main(String[] args) {
        SumOfN_Recursion obj = new SumOfN_Recursion();
       int sumF= obj.add(5);
       int sumR= obj.addR(5);
       System.out.println(sumF);
       System.out.println(sumR);
        
    }    
}
