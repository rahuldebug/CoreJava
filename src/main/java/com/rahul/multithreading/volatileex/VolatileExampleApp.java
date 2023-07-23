package com.rahul.multithreading.volatileex;

public class VolatileExampleApp {
    static VolatileExample volatileExample = new VolatileExample();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            volatileExample.increment();
        });
        Thread t2 = new Thread(() -> {
            volatileExample.flag = false;
        });
        t1.start();
        //t1.join();
        t2.start();
        //t2.join();
    }
}
/*
* Volatile solves issue of visibility
* and generally used in flags
* if we use join it waits other thread to finish the work ,
*  and in our scenario , it will lead to infinite loops*/