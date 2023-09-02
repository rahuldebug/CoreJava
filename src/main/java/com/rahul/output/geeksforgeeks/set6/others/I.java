package com.rahul.output.geeksforgeeks.set6.others;


import java.util.*;
class I
{
    public static void main (String[] args)
    {
        Object i = new ArrayList().iterator();
        System.out.print((i instanceof List) + ", ");
        System.out.print((i instanceof Iterator) + ", ");
        System.out.print(i instanceof ListIterator);
    }
}

//false, true, false