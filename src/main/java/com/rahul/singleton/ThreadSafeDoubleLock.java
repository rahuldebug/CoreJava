package com.rahul.singleton;

public class ThreadSafeDoubleLock {
    private static volatile ThreadSafeDoubleLock threadSafeDoubleLock;

    private ThreadSafeDoubleLock() {
    }

    private static ThreadSafeDoubleLock getInstance() {
        if (threadSafeDoubleLock == null) {

            synchronized (ThreadSafeSingleton2.class) {
                if (threadSafeDoubleLock == null) {
                    threadSafeDoubleLock = new ThreadSafeDoubleLock();
                }

            }
        }
        return threadSafeDoubleLock;
    }
}
