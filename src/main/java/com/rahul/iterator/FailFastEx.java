package com.rahul.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*According to java specification , we have fail-fast iterator . Although not guaranteed but they throw exception
when modified while iteration is going on .

Mod count is checked everytime before the itr.hasNext

we can avoid this by using iterator.remove

* */
public class FailFastEx {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
//the concurrent modification occurs in below code

//        for (Integer i:numbers){
//            if (i==3) numbers.remove(3);
//        }
// this can be avoided by below code snippet
        Iterator<Integer> itr = numbers.iterator();
        while ((itr.hasNext())) {
            if (itr.next() == 3) {
                itr.remove();
                //number.remove(); would have thrown the concurrent modification exception
                //still adding would have caused exception
                //to avoid this we can use failsafe (not a term of java se )

            }
            System.out.println(itr.next());
        }

    }
}
