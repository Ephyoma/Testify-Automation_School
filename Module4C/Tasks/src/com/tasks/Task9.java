package com.tasks;

public class Task9 {
    public static void main(String[] args) {

        //I have a list of numbers, 1-10, write a loop that prints odd if
        // it is an odd number and a loop that prints even if it is an even number

        for(int number = 1; number <10; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even Number");
            } else {
                System.out.println(number + " is Odd Number ");
            }
        }
    }
}
