package com.rahul.oops;

class Vehicle1 {
    int id = 1;

    public void blowHorn() {
        System.out.println("vehicle horn blown");
    }
}

class Car1 extends Vehicle1 {
    int id = 2;

    public void blowHorn() {
        System.out.println("car horn blown");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Vehicle1 car = new Car1();
        System.out.println(car.id);
        car.blowHorn();
        //System.out.println(car.blowHorn());
        //Car1 car2=new Vehicle1();
    }
}
/*
output ::
* 1
car horn blown
* */