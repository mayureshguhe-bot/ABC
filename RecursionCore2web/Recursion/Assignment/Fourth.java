package Assignment;

public class Fourth {
int count=0;
    int length(int num){
        if(num==0)
            return 0;
        return 1 + length(num/10);

    }
    public static void main(String[] args) {
        Fourth obj = new Fourth();
        int ret=obj.length(1234);
        System.out.println(ret);
    }
}
