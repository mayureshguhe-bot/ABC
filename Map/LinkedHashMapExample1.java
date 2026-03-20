// Understanding the concept of access order using LRU(Least Recently Used) cache example


import java.util.*;

class LRUCache<K,V> extends LinkedHashMap<K,V>  {
    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);  //access order: true
        this.capacity=capacity;
    }

    @Override
       protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }
    
}

public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LRUCache<Integer,String> cache= new LRUCache<>(3);

        cache.put(1,"A" );
        cache.put(2,"B" );
        cache.put(3,"C" );

        cache.get(1);
        cache.get(3);

        System.out.println(cache);

        cache.put(4, "D");  //should remove least used
        System.out.println(cache);
        

    }
}
