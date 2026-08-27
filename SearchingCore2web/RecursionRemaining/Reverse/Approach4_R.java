// Using Recursion: Hint-> Use subString() method

package SearchingCore2web.RecursionRemaining.Reverse;

public class Approach4_R {

    String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Approach4_R obj = new Approach4_R();
        String str = obj.reverse("Core2Web");
        System.out.println(str);
    }
}
