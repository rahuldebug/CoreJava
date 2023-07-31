package com.rahul.multithreading.atomicInteger;

public class AtomicIntegerApp {
    static AtomicIntegerEx atomicIntegerEx= new AtomicIntegerEx();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            atomicIntegerEx.increment();
        });
        Thread t2 = new Thread(() -> {
            atomicIntegerEx.decrement();
        });
        t1.start();
        //t1.join();
        t2.start();
        //t2.join();
    }
}
