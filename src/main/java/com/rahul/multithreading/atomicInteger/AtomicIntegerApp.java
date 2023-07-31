package com.rahul.multithreading.atomicInteger;

public class AtomicIntegerApp {
    static AtomicIntegerEx atomicIntegerEx = new AtomicIntegerEx();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicIntegerEx.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicIntegerEx.decrement();
            }
        });
        t1.start();

        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(atomicIntegerEx.getVal());
    }
}
