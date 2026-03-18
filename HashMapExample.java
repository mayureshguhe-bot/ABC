// Frequency Checking Example using HashMap

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 4, 5, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            // Direct approach using getOrDefault:
            map.put(num, map.getOrDefault(num, 0) + 1); // getOrDefault: if num exist -> return its vaule
                                                        // if not -> return 0
            // logic behind the above:
            // if(map.containsKey(num)){
            // map.put(num,map.get(num)+1);
            // }
            // else{
            // map.put(num,1);
            // }
        }
        System.out.println(map);
    }
}