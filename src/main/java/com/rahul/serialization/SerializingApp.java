package com.rahul.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingApp {
    public static void main(String[] args) throws IOException {
        Student student= new Student();
        student.setId(1);
        student.setName("rahul");
        String filePath = "src/main/resources/student.ser";
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
    }
}
