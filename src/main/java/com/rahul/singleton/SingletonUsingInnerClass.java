package com.rahul.singleton;

public class SingletonUsingInnerClass {
    private SingletonUsingInnerClass() {

    }

    //Inner classes don't get automatically initialized
    private static class SingletonUsingInnerClassHelper {
        private static final SingletonUsingInnerClass singletonUsingInnerClass = new SingletonUsingInnerClass();
    }

    public SingletonUsingInnerClass getInstance() {
        return SingletonUsingInnerClassHelper.singletonUsingInnerClass;
    }
}
