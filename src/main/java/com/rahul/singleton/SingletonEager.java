package com.rahul.singleton;

public class SingletonEager {
    //private constructor , so instance of the class can be created
    private SingletonEager() {

    }

    //eager initialization
    private static SingletonEager singletonEager = new SingletonEager();

    //static class to get the object
    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
