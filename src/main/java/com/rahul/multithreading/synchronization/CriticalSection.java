package com.rahul.multithreading.synchronization;

public class CriticalSection {
    private int val = 0;

    public void increment() {
        val++;
    }

    public void decrement() {
        val--;
    }

    public int getVal() {
        return val;
    }
}
