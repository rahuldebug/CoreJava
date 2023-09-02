package com.rahul.output.geeksforgeeks.set4;

/*class Base {
    protected void foo() {}
}
class Derived extends Base {
    void foo() {}
}
public class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.foo();
    }
}
While overriding derived classes cannot be more restrictive
public --> open for all
protected --> only in derived class
default -->  only in derived classes within same package
private --> only within class
*/


/*
* class Complex {
    private double re, im;
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
    Complex(Complex c) {
        re = c.re;
        im = c.im;
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(c1);
        System.out.println(c2);
    }
}*
Java makes default constructor only when there is no constructor defined , in this case since the constructor has been defined
there will be no default constructor , or we have to define the default constructor
* *
/
 */
public class Main {
}
