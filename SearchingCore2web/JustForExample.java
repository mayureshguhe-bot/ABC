package SearchingCore2web;
// Q. If we change an array in a function, will that array be affected in main?

// Ans. Yes.
// When we pass an array to a function, a copy of the array reference is passed.
// Both the main method and the function refer to the same array object.
// Therefore, changes made to the array inside the function are visible in main.
import java.util.*;

public class JustForExample{

    static int[] printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]+=5;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        printArr(arr);
    for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


    }
}