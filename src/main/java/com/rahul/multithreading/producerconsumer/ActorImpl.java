package com.rahul.multithreading.producerconsumer;

public class ActorImpl {
    public static void main(String[] args) {
        Actor actor = new Actor();

        Thread t1 = new Thread(actor::produce);
        Thread t2 = new Thread(actor::consume);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
