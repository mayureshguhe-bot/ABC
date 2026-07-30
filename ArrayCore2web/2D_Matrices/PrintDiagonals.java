/* Given a matrix of size N*M.Print all the diagonals staring from 0th row.*/

public class PrintDiagonals {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };

        for (int j = arr[0].length - 1; j >= 0; j--) {
            int i = 0;
            int y = j;

            while (i < arr.length && y >= 0) {
                System.out.print(arr[i][y] + " ");
                i++;
                y--;
            }

            // Using For Loop:

            // for(;i<arr.length && y>=0;i++,y--){
            // System.out.print(arr[i][y] + " ");
            // }

            System.out.println();
        }

    }

}

// Time Complexity : O(N*M)
