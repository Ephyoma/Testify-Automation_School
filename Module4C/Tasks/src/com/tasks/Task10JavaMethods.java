package com.tasks;

import java.util.Scanner;

public class Task10JavaMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Task10JavaMethods verify = new Task10JavaMethods();

        System.out.println("Please enter where you are coming from:");
        String userInput = scanner.nextLine();

        verify.studentverification(userInput);
    }
    //Create a method that verify that visitors on the slack channel
    // are coming fot testify Trainings.
    // If they write" Testify" then print out a  welcome messsage
    // if not , theuser should be shown rejection message.
    // after creating this method,then invoke the created method
    // in your main method
// to acccess the properties of class, we need to create an object of the class
    public void  studentverification (String  input ) {

        if (input.equalsIgnoreCase("Testify"))
        {
            System.out.println("Welcome to Testify Training");
        } else {
            System.out.println("Access Denied");
        }

    }

}

