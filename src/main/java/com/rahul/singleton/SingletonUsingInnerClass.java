package com.rahul.singleton;

public class SingletonUsingInnerClass {
    private SingletonUsingInnerClass() {

    }

    //Inner classes don't get automatically initialized
    private static class SingletonUsingInnerClassHelper {
        private static final SingletonUsingInnerClass singletonUsingInnerClass = new SingletonUsingInnerClass();
    }

    public static  SingletonUsingInnerClass getInstance() {
        return SingletonUsingInnerClassHelper.singletonUsingInnerClass;
    }
}
