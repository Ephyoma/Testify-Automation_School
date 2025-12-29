package com.tasks;

public class Task6 {
    public static void main(String[] args) {
        //StringOperations

        //Task 6: Write a code to reverse the string DEMOCRACY and get the word COME out of it.
        String word = "DEMOCRACY";
        //upper and lower case
        //System.out.println(word.toUpperCase());
        //System.out.println(word.toLowerCase());

        //Index of character
        //System.out.println(word.indexOf("M"));

        //char at a particular index
        //System.out.println(word.substring(0,4));

        // Reverse the string

        String reverseed = new StringBuilder(word).reverse().toString();

        //Extract COME

        String result = reverseed.substring(4,8);
        System.out.println(result);


    }
}
