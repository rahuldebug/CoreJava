package com.rahul.output.string;

public class StringTest {
    public static void main(String[] args) {
        String og = "opengenus";
        String og2 = new String(og);

        System.out.println((og==og2) + " "+ (og.equals(og2)));
        og2=og2.intern();
        System.out.println((og==og2) + " "+ (og.equals(og2)));

    }
}
/*
* false true
true true*/