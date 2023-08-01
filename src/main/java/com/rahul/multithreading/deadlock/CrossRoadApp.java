package com.rahul.multithreading.deadlock;

public class CrossRoadApp {
    public static void main(String[] args) {
        CrossRoads crossRoads= new CrossRoads();
        Thread t1= new Thread(()->{
            while(true){
                crossRoads.roadCrossing1();
            }
        });
        Thread t2= new Thread(()->{
            while(true){
                crossRoads.roadCrossing2();
            }
        });
        t1.start();
        t2.start();
    }
}
