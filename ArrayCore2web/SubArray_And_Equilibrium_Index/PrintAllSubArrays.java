/* Given an array of size N. Print all SubArrays.
    int[] arr= new int[]{2,4,1,3};
*/

public class PrintAllSubArrays {
    public static void main(String[] args) {
         int[] arr= new int[]{2,4,1,3};

for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr.length;j++){
        System.out.print(arr[i]+" "+arr[j]);
        // for(int k=i;k<=j;k++){
        //     System.out.print(arr[k]+" ");
        // }
        System.out.println();
}}
    }
    
}
