package com.rahul.multithreading.synchronization;

public class CriticalSectionObjectLock {
    Object lock1 = new Object();
    Object lock2 = new Object();
    private int val = 0;

    public synchronized void increment() {
        synchronized (lock1) {
            val++;
        }
    }
    public synchronized void decrement() {
        synchronized (lock2) {
            val--;
        }
    }

    public synchronized int getVal() {
        return val;
    }
}
