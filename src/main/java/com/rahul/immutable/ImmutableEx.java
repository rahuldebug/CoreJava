package com.rahul.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableEx {
    private final String name;
    private final List<String> petname;

    public ImmutableEx(String name, List<String> petname) {
        this.name = name;
        this.petname = petname;
    }
    public String getName(){
        return name;
    }
    public List<String> getPetname(){
        return new ArrayList<>(petname);
    }
}
