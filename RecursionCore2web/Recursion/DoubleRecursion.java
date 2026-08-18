public class DoubleRecursion {
    int fun(int num){
        if(num <= 1)
            return 1;
        return fun(num-2) + fun(num-1);
    }
    public static void main(String[] args) {
        DoubleRecursion obj = new DoubleRecursion();
         int ret = obj.fun(5);
         System.out.println(ret);
    }
}
// Note: Draw stack Frames.