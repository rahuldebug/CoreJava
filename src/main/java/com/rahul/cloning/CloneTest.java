package com.rahul.cloning;

/*
*
The default behavior of an object’s clone() method automatically yields a shallow copy.
So to achieve a deep copy the classes must be edited or adjusted.

Shallow copy:Generally clone method of an object,
creates a new instance of the same class and copies all the fields to the new instance and returns it.
  This is called shallow copy.
Object class provides a clone method and provides support for the shallow copy.
* It returns ‘Object’ as type and you need to explicitly cast back to your original object.
* Since the Object class has the clone method, you cannot use it in all your classes.
*  The class which you want to be cloned should implement clone method and overwrite it.
* It should provide its own meaning for copy or to the least it should invoke the super.clone().
*  Also you have to implement Cloneable marker interface or else you will get CloneNotSupportedException.
*  When you invoke the super.clone() then you are dependent on the Object class’s implementation and what you get is a shallow copy.

Deep copy:When you need a deep copy then you need to implement it yourself.
*  When the copied object contains some other object its references are copied recursively in deep copy.
* When you implement deep copy be careful as you might fall for cyclic dependencies.
*  If you don’t want to implement deep copy yourselves then you can go for serialization.
* It does implements deep copy implicitly and gracefully handling cyclic dependencies.
* */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("10 downing street");
        Student student1 = new Student(10, "rishi", address);
        Student student2 = (Student) student1.clone();
        Address address1=new Address("karnataka");
        student2.address=address1;
        student1.id=55;

        System.out.println(student1);
        System.out.println(student2);
    }
}
