public class JustExampleOptimised {
    public static void main(String[] args) {
        char[] arr = new char[] { 'a', 'b', 'e', 'g', 'a', 'g' };
        int gcount=0;
        int count=0;

        for(int i =arr.length-1;i>=0;i--){              // TC: O(n) 
            if(arr[i]=='g') {gcount++;}
           else if(arr[i]=='a') {count+=gcount;}
                      
        }
             System.out.println("Count: "+count); 
    }
    
}

// Optimised Time Complexity: O(n) , Space Complexity: O(1) 