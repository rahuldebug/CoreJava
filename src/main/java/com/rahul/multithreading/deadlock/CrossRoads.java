package com.rahul.multithreading.deadlock;

public class CrossRoads {
    Object road1 = new Object();
    Object road2 = new Object();

    public void roadCrossing1() {
        synchronized (road2) {
            System.out.println("accquired lock for road 1 ");
            System.out.println(Thread.currentThread().getName());
            synchronized (road1) {
                System.out.println("accquired lock for road 2");
                System.out.println("now let train pass");
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
//just change the order of locks to get into deadlock , which is generally result cross chaining of lock dependencies
    public void roadCrossing2() {
        synchronized (road1) {
            System.out.println("accquired lock for road 1 ");
            System.out.println(Thread.currentThread().getName());
            synchronized (road2) {
                System.out.println("accquired lock for road 2");
                System.out.println("now let train pass");
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
}
