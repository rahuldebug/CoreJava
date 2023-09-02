package com.rahul.output.geeksforgeeks.set5.shortoctalstring;

public class Main
{
    public static void main(String args[])
    {
        short s = 0;
        int x = 07;
       // int y = 08;
        int z = 112345;

        s += z;
        //y +
        System.out.println("" + x +  s);
    }
}

//octal has limit of 00 to 07 , in this case 08 crosses that limit
//in sout the first thing to concatenate is a string so everything is getting concatenated
// and short has limitation of 8bits or 32,xxx  hence some negative is getting printed for same

// o/p :: 7-18727