package SearchingCore2web.RecursionRemaining.Reverse;

public class Approach1 {
    public static void main(String[] args) {
        String str = new String("Core2Web");
        System.out.println(str);
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
