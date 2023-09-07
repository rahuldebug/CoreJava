package com.rahul.exceptionhandling.checked;
//JVM while doing loading --> linking --> initialization finds the class using name , and when it
// doesn't find the class throws the class not found exception
// this can also be mimicked by Class.forName()

public class ClassNotFoundEx {
    public static void main(String[] args) {
        String abc = "abc";

        //using try and catch we can catch exception and protect our
        // program execution from abrupt ending

        try {
           // method1(abc);
            //we can also throw our exception
            throw new RuntimeException("just like that");
        }
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //throws tells that this method might throw the exception and caller method should handle it
    private static void method1(String abc) throws ClassNotFoundException {
        Class.forName(abc);
    }
}
