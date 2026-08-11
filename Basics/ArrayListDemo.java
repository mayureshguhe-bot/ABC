import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

        System.out.println("List:"+ fruits);

        //adding element at index
        fruits.add(1,"Mango");
        System.out.println("After inserting Mango:"+ fruits);

        //accessing elements
        System.out.println("Element at index 4:"+ fruits.get(4));

        //updating element
        fruits.set(0, "Pineapple");
        System.out.println("After Update :"+ fruits);

        //Removing elements
        fruits.remove("Banana");
        System.out.println("List after removing Banana:"+ fruits);

        //size of arraylist
        System.out.println("Size:"+ fruits.size());
        
        //checking element
        System.out.println("Contains Mango?:"+fruits.contains("Mango"));

        //loop through arraylist
        System.out.println("All friuts:");
          for(String i: fruits){
            System.out.println(i);
          }

          //Clearing list
          fruits.clear();
          System.out.println("After Clearing:"+ fruits);
        
    }
    
}
