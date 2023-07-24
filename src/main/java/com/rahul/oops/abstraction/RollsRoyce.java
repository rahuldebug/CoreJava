package com.rahul.oops.abstraction;

import com.rahul.oops.abstraction.Car;

public class RollsRoyce extends Car {
    @Override
    public void makeNoise() {
        System.out.println("silent , I don't make noise ");
    }
}
