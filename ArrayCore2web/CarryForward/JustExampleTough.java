/* Given a character array (Lower Case), return the count of triplets
   (i, j, k) such that

   a) i < j < k
   b) arr[i] == 'a'
   c) arr[j] == 'b'
   d) arr[k] == 'c'

Input:
Arr = [a, b, a, c, b, c, a, c]

Output:
?

Constraints:
- Solve in O(n) time.
- Do not use nested loops.
- Use only O(1) extra space.
*/

public class JustExampleTough {
    public static void main(String[] args) {
        char[] arr =new char[]{'a', 'b', 'a', 'c', 'b', 'c', 'a', 'c'};
        int count =0;
        int bcCount=0;
        int cCount=0;

    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]=='c')
            cCount++;
        else if(arr[i]=='b')
            bcCount+=cCount;
        else if(arr[i]=='a')
            count+=bcCount;
    }

    System.out.println(count);
        
    }
    
}
