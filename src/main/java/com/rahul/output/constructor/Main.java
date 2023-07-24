package com.rahul.output.constructor;

class Parent {
    public void Print()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void Print()
    {
        System.out.println("Child");
    }
}

public class Main {
    public static void PrintMain(Parent o)
    {
        o.Print();
    }
    public static void main(String[] args)
    {
        Parent x = new Parent();
        Parent y = new Child();
        Child z = new Child();
        PrintMain(x);
        PrintMain(y);
        PrintMain(z);
    }
}
/*output :
* Parent
Child
Child*/
