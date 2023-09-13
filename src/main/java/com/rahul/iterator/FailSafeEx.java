package com.rahul.iterator;

import java.util.concurrent.CopyOnWriteArrayList;

/*According to java se there is no term like failsafe although commonly used
 * there are different ways to achieve this
 * 1> by using CopyOnWriteArrayList , this uses cloning internally for the iteration */
public class FailSafeEx {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer i : list) {
            if (i == 2) list.remove(i);
            System.out.println(i);
        }
    }
}
/*o/p
1
2
3
4
5
although it doesn't throw exception , but there is no guarantee the remove or add action will be performed */