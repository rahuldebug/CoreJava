package com.rahul.output.string;

public class StringTest {
    public static void main(String[] args) {
        String og = "opengenus";
        String og2 = new String(og);

        System.out.println((og==og2) + " "+ (og.equals(og2)));
        og2=og2.intern();
        System.out.println((og==og2) + " "+ (og.equals(og2)));
        String car = null, bus = "petrol";//both needs to intialized
        car = car + bus;
        System.out.println(car);
        //this will print the ascii values
        System.out.println('j' + 'a' + 'v' + 'a');
    }
}
/*
* false true
true true*/