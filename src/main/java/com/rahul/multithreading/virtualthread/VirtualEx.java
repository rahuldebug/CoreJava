package com.rahul.multithreading.virtualthread;

public class VirtualEx {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                System.out.println("index is  :" + i);
            }
        };
        //its available from java 19 onwards
        //Thread vThread = Thread.ofVirtual().start(runnable);
    }
}
