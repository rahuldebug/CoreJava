package com.rahul.immutable;

import java.util.ArrayList;
import java.util.List;
// once we declare final the value won't change ,
//so the refrence would be final but the value of the list can still be manipulated
//hence a copy id sent

/*Making the field final does two things:

Requires the value to be set through the constructor (or at least be resolved at construction time)
Prohibits the creation of a setter for the field
Provided that the datatype at the field isn't mutable (like an array), that should be sufficient to make the object immutable.
An immutable class basically means that its state can't be changed after it's instantiated,
 and if there are any changes, it would produce a new instance of the object.*/
public final class ImmutableEx {
    private final String name;
    private final List<String> petname;

    public ImmutableEx(String name, List<String> petname) {
        this.name = name;
        this.petname = petname;
    }

    public String getName() {
        return name;
    }

    public List<String> getPetname() {
        return new ArrayList<>(petname);
    }
}
