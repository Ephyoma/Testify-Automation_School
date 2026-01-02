package com.tasks;

public class Task11A {
    //Create a class A,
    // create a method that accepts a String parameter "name" and returns the "name" value.
    // Create an object of that class in another class  "B" and SOUT the contents from the methods in class A
   String name;

   public void aboutMe(String yourName){
       name = yourName;
       System.out.println(name);
   }
}
