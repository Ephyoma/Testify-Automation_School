package com.tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        //Build a Simple interest calculator. Write a program to ask the user
        // for the necessary field you need in calculating the simple interest and
        // then communicate the simple interest back to the user is a good sentence

        Scanner simpleinterest = new Scanner(System.in);
        System.out.println("Welcome, Please enter the Principal amount:");
        double principalAmount = simpleinterest.nextDouble();
        System.out.println("Please enter the rate of interest:");
        double rate = simpleinterest.nextDouble();
        System.out.println("Please enter the During in Years:");
        double time = simpleinterest.nextDouble();

        double interest = ( principalAmount * rate * time)/100;
        System.out.println("Your simple interest for a principal of "+ principalAmount + " at the rate of " + rate + "%" + " For " + time
                + " Years is " + interest);

    }
}
