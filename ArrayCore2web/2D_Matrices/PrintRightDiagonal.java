public class PrintRightDiagonal {
    public static void main(String[] args) {

        int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // for(int i =0;i<arr.length;i++){
        // for(int j=arr.length-1;j>=0;j--){
        // if(i+j==arr.length-1)    or use sop(arr[i][arr.length-1-i]) in single for loop.
        // System.out.println(arr[i][j]);
        // }
        // }

        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length && j >= 0) {
            System.out.println(arr[i][j]);
            i++;
            j--;
        }

    }

}
