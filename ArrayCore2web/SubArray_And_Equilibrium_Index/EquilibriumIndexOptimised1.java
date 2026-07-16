
public class EquilibriumIndexOptimised1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 0,0 };
        int[] LpfArr = new int[arr.length];
        int[] RpfArr = new int[arr.length + 1];
        LpfArr[0] = arr[0];
        RpfArr[arr.length - 1] = arr[arr.length - 1];
        int flag = 0;

        for (int i = 1; i < arr.length; i++) {            // TC : O(N)
            LpfArr[i] = LpfArr[i - 1] + arr[i];           // SC : O(N)
        }
        for (int i = arr.length - 2; i >= 0; i--) {       // TC : O(N)
            RpfArr[i] = RpfArr[i + 1] + arr[i];           // SC : O(N)
        }

        RpfArr[arr.length] = 0;

        for (int i = 0; i < arr.length; i++) {           // TC : O(N)
            if (i == 0 && RpfArr[i + 1] == 0){
                flag=1;
                System.out.println("Equilibrium Index: " + i);
                break;
            }
                
            if (i != 0) {
if (LpfArr[i - 1] == RpfArr[i + 1]) {
                    flag = 1;
                    System.out.println("Equilibrium Index: " + i);
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println("-1");

    }
}

// Total Time Complexity: O(N)+O(N)+O(N)=O(3N)==O(N)
// Space Complexity : O(N)