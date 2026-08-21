// WAP to print string in reverse order.

package Assignment;

public class Nineth {
    void printReverse(String s,int index){
        if(index<s.length()){
            printReverse(s, index+1);
            System.out.print(s.charAt(index)+" ");
        }
    }
    public static void main(String[] args) {
        Nineth obj = new Nineth();
        obj.printReverse("Subodh", 0);
    }
}
