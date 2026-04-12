/* Given an array of size N.
    Return the count of pairs(i,j) with arr[i]+arr[j]=K
    arr : [3,5,2,1,-3,7,7,8,15,6,13]
    N : 10
    K : 10              note: i!=j
    output= 6

*/

public class Array$1 {
    public static void main(String[] args) {
        int[] arr =new int[]{3,5,2,1,-3,7,7,8,15,6,13};
        int N=10;
        int K=10;
        int count=0;
        int itr =0;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                 itr++;
                if(i!=j){
                    if(arr[i]+arr[j]==K){
                        count++;
                       
                    }
                }
            }
        }
        System.out.println("Number of pairs with arr[i]+arr[j]=K : "+count);
        System.out.println("No. of iterations : "+itr);

        
    }
}
