package com.rahul.multithreading.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    AtomicInteger atomicInteger=new AtomicInteger(0);
    public void increment(){
        atomicInteger.incrementAndGet();
    }
    public  void decrement(){
        atomicInteger.decrementAndGet();
    }
    public int getVal(){
        return atomicInteger.get();
    }
}
