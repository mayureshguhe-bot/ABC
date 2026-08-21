package Assignment;

public class Seventh {

    int factorial(int num){
      if(num==0)
            return 1;
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Seventh obj = new Seventh();
        int ret = obj.factorial(5);
        System.out.println(ret);
    }
}
