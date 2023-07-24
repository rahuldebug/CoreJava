package com.rahul.oops.abstraction;

public abstract class Car implements Vehicle {
    @Override
    public void accelarate() {
        System.out.println("increase speed");
    }

    @Override
    public void decelrate() {
        System.out.println("decerease speed");
    }

    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }
    public abstract void makeNoise();
}
