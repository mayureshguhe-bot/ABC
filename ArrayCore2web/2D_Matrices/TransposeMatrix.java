/* Given a square matrix of size N*N.Convert the matrix to its transpose matrix. */

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {      // Since Square matrix
                int temp = arr[i][j];                       // -> j<arr.length
                arr[i][j] = arr[j][i];                      // otherwise arr[0].length
                arr[j][i] = temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }

    }

}
