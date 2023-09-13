package com.rahul.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.List;

public class Actor {
    int capacity = 10;
    int initial = 0;
    List<Integer> queue = new LinkedList<>();

    public void produce() {

        while (true) {
            synchronized (this) {
                System.out.println("in producer");
                while (queue.size() == capacity) {
                    try {
                        wait();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("adding value to the queue");
                queue.add(initial++);

                notifyAll();

            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (this) {
                System.out.println("in consumer");
                while (queue.size() == 0) {
                    try {
                        wait();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(queue.get(0));
                queue.remove(0);
                notifyAll();
            }
        }
    }
}