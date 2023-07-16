package com.rahul.singleton;

public class ThreadSafeSingleton2 {
    private static volatile ThreadSafeSingleton2 threadSafeSingleton2;

    private ThreadSafeSingleton2() {
    }

    private static ThreadSafeSingleton2 getInstance() {

        synchronized (ThreadSafeSingleton2.class) {
            if (threadSafeSingleton2 == null) {
                threadSafeSingleton2 = new ThreadSafeSingleton2();
            }
            return threadSafeSingleton2;
        }
    }
}