package com.task12A;


//Create two packages.
// in each of the packages create one class each Class A and Class B.
// create a method in class A that can be accessed anywhere in that project and
// create a method in Class B that can only be accessed within a class.
import com.Task12B.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassA publicMethod = new ClassA();
        publicMethod.publicAccess();

    }

    public  void  publicAccess() {
        System.out.println("This is Public Access");
    }
}

