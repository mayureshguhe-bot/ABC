/* Given a character array(Lower Case) return the count of pair
   (i,j) such that
   a) i<j
   b) arr[i]='a' & arr[j]='g'
Input:- Arr: [a,b,e,g,a,g]    output :3
 */

public class JustExample {
    public static void main(String[] args) {
        char[] arr = new char[] { 'a', 'b', 'e', 'g', 'a', 'g' };
        int count = 0;
        int itr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 'a' && arr[j] == 'g') {
                    count++;
                }
                itr++;
            }
        }
        System.out.println("itr: "+ itr);
        System.out.println("count: "+ count);
        Optimised obj = new Optimised();
        int ans=obj.optimised(arr);
        System.out.println("count: "+ans);

    }
}

class Optimised {
    public int optimised(char[] arr) {
        int count = 0;
        int itr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 'g') {
                        count++;

                    }
                    itr++;
                }
            }
        }
        System.out.println("itr :" + itr);
        return count;

    }
}