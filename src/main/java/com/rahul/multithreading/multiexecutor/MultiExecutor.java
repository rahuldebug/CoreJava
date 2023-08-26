package com.rahul.multithreading.multiexecutor;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {
    private List<Runnable> tasks = new ArrayList<>(16);
    private Integer size;

    public MultiExecutor(List<Runnable> tasks, int size) {
        this.tasks = tasks;
        if (size < 16) {
            this.size = size;
        } else {
            this.size = 16;
        }
    }

    public void execute(List<Runnable> tasks) {
        //getThreadPool();
        List<Thread> threads = new ArrayList<>(tasks.size());
        for (Runnable task : tasks) {
            Thread t = new Thread(task);
            threads.add(t);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }

}
