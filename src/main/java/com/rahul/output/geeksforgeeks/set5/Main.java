package com.rahul.output.geeksforgeeks.set5;

public class Main
{
    public static void gfg(String s)
    {
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }

    public static void main(String args[])
    {
        gfg(null);
    }
}
//since String is specific type of Object so it prints String in o/p

class Main2
{
    public static void gfg(String s)
    {
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
    public static void gfg(Integer i)
    {
        System.out.println("Integer");
    }

    public static void main(String args[])
    {
       // gfg(null);
    }
}
//since both string and integer are more specific type