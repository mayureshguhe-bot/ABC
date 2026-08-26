package SearchingCore2web.RecursionRemaining.Reverse;

public class Approach2 {
    public static void main(String[] args) {
        String str = new String("Core2Web");
        String newStr = "";

        for(int i =str.length()-1;i>=0;i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(newStr);

        StringBuffer str1 = new StringBuffer(str);
        System.out.println(str1.reverse());
    }
}
