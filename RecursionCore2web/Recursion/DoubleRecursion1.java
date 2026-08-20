public class DoubleRecursion1 {
    void fun(int num) {
        if (num <= 1)
            return;
        fun(num - 2);
        System.out.println(num);
        fun(num - 1);
    }

    public static void main(String[] args) {
        DoubleRecursion1 obj = new DoubleRecursion1();
        obj.fun(5);
    }
}
// Note: Draw stack Frames.