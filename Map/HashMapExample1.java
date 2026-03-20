//  frequency + printing the 1st element with frequency 1 i.e. which appears once : 

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 4, 2, 5, 5, 1, 6 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        // when order is mandatory:
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println(num);
                break;
            }
        }

        // When order does not needed only value
        // for(Map.Entry <Integer,Integer> n :map.entrySet()){
        // if(n.getValue()==1){
        // System.out.println(n.getKey());
        // break;
        // }
        // }

    }

}
