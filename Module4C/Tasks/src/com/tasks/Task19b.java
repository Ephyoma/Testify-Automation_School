package com.tasks;

//STATIC: I want to use the value of a variable in one class in another class at runtime.
// I also want to access the variable without creating an object of its class.
// Help me implement this
public class Task19b {

    String names = "Ronke";
    public static void main(String[] args) {

        //Calling the variable "name" created in Task19
        System.out.println(Task19a.name);
    }
}
