package com.tasks;

public class task5 {
    public static void main(String[] args) {

        //*conditional statement
        int age = 15;
        //int number = 3;
        //int number2 = 5;

        //true
        if (age % 3 == 0){
            System.out.println("Fizz");

        }
        //true
        else if (age % 5 == 0) {
           System.out.println("Buzz");

        } else if (age % 3 == 0 && age % 5 == 0) {
            System.out.println("FizzBuzz");
            
        } else {
            System.out.println("Recheck");
        }
        //System.out.println("Recheck Condition");
    }
}
