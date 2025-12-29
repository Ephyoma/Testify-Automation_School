package com.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //Task7: create a two dimensional array with 4 rows and 3 columns.
        // Fill only the first column with any fruits of ur choice

// Single Dimentional Arrays
        int [] array1 = new int [5];
//        array1[0] = 10;
//        array1[1] = 4;
//        array1[4] = 5;
//        System.out.println(Arrays.toString(array1));

//        String [] fruits = {"Mango", "Orange", "Apple"};
//
//        System.out.println(Arrays.toString(fruits));

        // Double Dimention Array

//        int [] [] doubleDimen = new int [2] [3];
//        doubleDimen [0] [0] = 20;
//        doubleDimen [0] [1] = 30;
//        System.out.println(Arrays.deepToString(doubleDimen));

        // Create a 2D array with 4 rows and 3 columns

        String [] [] fruits =  new String[4] [3];
        fruits [0] [0] = "Mango";
        fruits [1] [0] = "Orange";
        fruits [2] [0] = "Apple";
        fruits [3] [0] = "Grapes";

        System.out.println(Arrays.deepToString(fruits));

        // Print the array



    }
}
