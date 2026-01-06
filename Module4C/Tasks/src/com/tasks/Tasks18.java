package com.tasks;

//Write a code that asks the user for age and that accepts the Integer value.
// Handle the error that is encountered when the users tries to enter a name instead of age

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasks18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Your Age");

            int age = scanner.nextInt();
            // If input is correct

            System.out.println("Your age is " + age);
        } catch (InputMismatchException Invalid){
            // Handle wrong input (name instead of number)
            System.out.println("Invalid input! Please enter a number for age.");
        }
        scanner.close();
        }



}

