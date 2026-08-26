package SearchingCore2web.RecursionRemaining.Reverse;

public class Approach3 {
    public static void main(String[] args) {
        String str = new String("Core2Web");

        System.out.println(str);

        char[] newStr = str.toCharArray();
        int start = 0;
        int end = newStr.length - 1;
        while (start < end) {
            char temp = newStr[start];
            newStr[start] = newStr[end];
            newStr[end] = temp;

            start++;
            end--;

        }
        System.out.print(newStr);   // for char array we can directly print it without using for loop.
                                    //  It uses toString like method. 

    }
}
