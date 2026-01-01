package com.tasks;

import java.util.Scanner;

public class Task9b {
    public static void main(String[] args) {

        //Task9B: Write a logic that takes in input from the user.
        // It keeps printing "try again "until the user enters "testify"


        //while loop
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("testify")){
            System.out.println("\"Try again\"");
            userInput = scanner.nextLine();
        }
    }
}
