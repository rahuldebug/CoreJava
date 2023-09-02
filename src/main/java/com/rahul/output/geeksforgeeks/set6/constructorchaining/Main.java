package com.rahul.output.geeksforgeeks.set6.constructorchaining;


    class First
    {
        public First()
        {
          //  super();
            System.out.println("a");
        }
    }

    class Second extends First
    {
        public Second()
        {
           // super();
            System.out.println("b");
        }
    }

    class Third extends Second

    {

        public Third()   {
           // super();
            System.out.println("c"); }
    }

    public class Main
    {
        public static void main(String[] args)
        {
            Third c = new Third();
        }
    }
//simple case of constructor chaining
//by default every constructor call super () as first line of their constructor
/*o/p:
a
b
c
*/