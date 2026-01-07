package com.tasks;

//THIS:  https://i.imgur.com/aRkRDPa.png
// You have a class with a method printName.
// write a code in the printName method that will print the instance member which is "Delta" and whatever name the user enter when invoking the method
public class Task19d {
//Instance variable
    String name = "Delta";

    public static void main(String[] args) {
        Task19d name = new Task19d();
        //User input value
        name.printName("Lagos");


    }

    public void printName(String name) {

        // Method that prints both instance variable and user input
        System.out.println("Your city name is " + this.name);
        System.out.println("My city name is " + name);

    }
}
