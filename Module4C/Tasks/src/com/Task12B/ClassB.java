package com.Task12B;


//Create two packages.
// in each of the packages create one class each Class A and Class B.
// create a method in class A that can be accessed anywhere in that project and
// create a method in Class B that can only be accessed within a class. (ClassB

import com.task12A.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA publicMethod = new ClassA();
        publicMethod.publicAccess();

        ClassB privatedMethod = new ClassB();
        privatedMethod.privateAccess();


    }
    private  void  privateAccess() {
        System.out.println("This is Protected Access");
    }


}

