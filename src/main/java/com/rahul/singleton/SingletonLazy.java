package com.rahul.singleton;

public class SingletonLazy {
    //private constructor , so no new instance can be created
    private SingletonLazy() {
    }

    //private static variable , with uninitialized reference
    private static SingletonLazy singletonLazy;

    //lazy initialization
    public static SingletonLazy getInstance(){
        if (singletonLazy==null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
