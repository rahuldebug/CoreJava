package com.rahul.multithreading.synchronization;

public class CriticalSectionApp {
    public static void main(String[] args) {
        // CriticalSection criticalSection = new CriticalSection();

        // CriticalSectionThisLock criticalSection= new CriticalSectionThisLock();

        CriticalSectionObjectLock criticalSection = new CriticalSectionObjectLock();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                criticalSection.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                criticalSection.decrement();
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
        System.out.println(criticalSection.getVal());
    }
}
