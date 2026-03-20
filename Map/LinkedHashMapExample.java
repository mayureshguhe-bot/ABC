import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map= new LinkedHashMap<>(4,0.5f,true);
        map.put(1, "X");
        map.put(2,"Y");
        map.put(3,"Z");

        System.out.println(map);

        map.get(2);
        map.get(1);

        System.out.println(map);

        map.put(4, "new");
        map.put(5, "n");
          System.out.println(map);
          


    }
}
