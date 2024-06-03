package com.rahul.serializationExternalization;

import java.io.Serializable;

public class Student extends People implements Serializable {

    String section;

    @Override
    public String toString() {
        return "Student{" +
                "section='" + section + '\'' +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                '}';
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

