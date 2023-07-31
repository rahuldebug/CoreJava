package com.rahul.multithreading.synchronization;


//synchronized at method level is as good as this lock ,
// i.e if one synchronized method is being executed other cannot be executed
//so this is class level lock
public class CriticalSectionThisLock {
    private int val = 0;

    public  synchronized  void increment() {
        val++;
    }

    public synchronized void decrement() {
        val--;
    }

    public synchronized int getVal() {
        return val;
    }
}
