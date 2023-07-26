package com.rahul.output.constructor;

public class Chain2 extends Chain1{
    // since we have taken over responsibility of initializing constructor , we
    // have to write one matching super
    Chain2(String name) {
        super(name);
    }
    //constructor cannot be static , final synchronized or abstract .
}
