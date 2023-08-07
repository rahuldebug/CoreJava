package com.rahul.serializationExternalization;

import java.io.Serializable;

public class People implements Serializable {
   // private static final long serialVersionUID = 1L;
    private static final long serialVersionUID = 2L;
    private int id;
    private String name;

//    @Override
//    public String toString() {
//        return "People{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
