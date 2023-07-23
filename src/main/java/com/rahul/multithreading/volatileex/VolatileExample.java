package com.rahul.multithreading.volatileex;

public class VolatileExample {
    volatile Boolean flag = true;
    int count = 0;

    public void increment() {
        while (flag) {
            count++;
            System.out.println(count);
            Thread.currentThread().getName();
        }
    }


}
