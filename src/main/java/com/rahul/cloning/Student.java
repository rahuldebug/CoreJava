package com.rahul.cloning;

public class Student implements Cloneable {
    int id;
    String name;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
