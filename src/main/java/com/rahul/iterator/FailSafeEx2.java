package com.rahul.iterator;

/*fail safe without a copy , concurrent hash map ,
 which is weakly consistent(no guarantee for atomicity
* all thread safe classes  */
/*they may proceed concurrently with other operations
they will never throw ConcurrentModificationException
they are guaranteed to traverse elements as they existed upon construction exactly once,
 and may (but are not guaranteed to) reflect any modifications subsequent to construction.*/

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeEx2 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            if (itr.next().equals(3)) {
                map.put(6, 6);
            }
        }
    }
}
// NoSuchElementException