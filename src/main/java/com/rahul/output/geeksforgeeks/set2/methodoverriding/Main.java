package com.rahul.output.geeksforgeeks.set2.methodoverriding;

class Base {
    public void Print() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public void Print() {
        System.out.println("Derived");
    }
}

public class Main {
    public static void DoPrint(Base o) {
        o.Print();
    }

    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}

/*
package main;

// filename Main.java
class Point {
    protected int x, y;

    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}

public class Main {
    public static void main(String args[])
    {
        Point p = new Point();
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
no default constructor , hence compile time error
*/