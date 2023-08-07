package com.rahul.serializationExternalization;

import java.io.*;

public class SerializingApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student student= new Student();
//        student.setId(1);
//        student.setName("rahul");
//        student.setSection("c");
          String filePath = "src/main/resources/student.ser";
//        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(student);


        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student deserializedUser = (Student) objectInputStream.readObject();
        System.out.println(deserializedUser);

    }
}
//Transient , static are not serialized ,
// if parent class is not serialized , we do not get values in deserialization
// if parents implmets serialization , child need not mention it
// com.rahul.serialization.People; local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = 2

