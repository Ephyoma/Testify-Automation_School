package com.tasks;
//SUPER: Class B is extending Class A,
// Class B has a variable String name = "Anderson"
// while Class A has the same varible name and type is an attribute "Ronke".
// Print out the value of Class A and class B in your main method using the object of only One class. (Dont create two objects).
//Solution: Class A = Task19Static and Class B = Task19Supper

public class Task19c extends Task19b {
String names = "Anderson";

    public static void main(String[] args) {
        //Object of one class Task19Supper
        Task19c obj = new Task19c();
        obj.names();
    }
    public void names(){

        //Print out the value of Class A and class B
        System.out.println("The Teachers name is " + super.names);
        System.out.println("The Student Name is " + names);
    }
}
