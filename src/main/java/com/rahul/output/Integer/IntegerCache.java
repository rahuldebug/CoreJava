package com.rahul.output.Integer;

public class IntegerCache {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Integer c = 127;
        Integer d = 127;
        System.out.println(a == b);
        System.out.println(c == d);

        /*-128 (IntegerCache.low) to 127 (IntegerCache.high)
        so objects are not compared , for rest it is object comparison
        */
    }
}
