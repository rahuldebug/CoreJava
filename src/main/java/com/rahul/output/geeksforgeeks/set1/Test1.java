package com.rahul.output.geeksforgeeks.set1;
/*As we know default value for primitive type 0 , and wrapper class is null
* */

public class Test1 {
    protected int x, y;
  // protected Integer x, y;
}

class Main {
    public static void main(String args[]) {
        Test1 t = new Test1();
        System.out.println(t.x + " " + t.y);
    }
}


// filename Test.java


//hence for primitive is zero, and for wrapper is null
// 0 0
// null null

/*
*
class Test {
    public static void main(String[] args) {
        for(int i = 0; 1; i++) {
            System.out.println("Hello");
            break;
        }
    }
}
* compile time error in for loop the middle value should return boolean
*/
//corrected program below
class Test {
    public static void main(String[] args) {
        for(int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }
    }
}

/*
// filename Main.java
class Main {
    public static void main(String args[]) {
        System.out.println(fun());
    }
    int fun() {
        return 20;
    }
}
* static method making call to non static methods, hence compile time error
*/
//corrected class below , adding static to method or by creating Object

class Main1 {
    public static void main(String args[]) {
        System.out.println(fun());
    }
    static int fun() {
        return 20;
    }
}

/*
// filename Test.java
class Test {
   public static void main(String args[]) {
       System.out.println(fun());
   }
   static int fun() {
       static int x= 0;
       return ++x;
   }
}

compile time error
local static variables are not allowed
*/
