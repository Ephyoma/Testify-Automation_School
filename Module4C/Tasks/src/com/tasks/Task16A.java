package com.tasks;


//Overloading
//Create a method in a class and Overload in using the 3 different ways of overloading that you know

public class Task16A {

    public  void overLoading(){
        System.out.println("Overloading with no parameter");

    }
    //1. Number of Parameters

    public  void overLoading(String overload){
        System.out.println("Overloading with Single parameter");

    }
    public  void overLoading(String overload, String overload2){
        System.out.println("Overloading with 2 parameter");

    }

    //Overloading with Data Type Paameters
    public  void overLoading(int numbers, double division){

    }

    public  void overLoading(int numbers, float
                              addition){
        System.out.println("Overloading with Data Type parameter");

    }

    //Overloading with Sequence of Data type parameters

    public  void overLoading(int numbers, String value){

    }

    public  void overLoading(String value, int numbers){
        System.out.println("Overloading with Sequence Data Type Parametes");

    }

    public static void main(String[] args) {
        Task16A overloading = new Task16A();
        overloading.overLoading();
        overloading.overLoading("Testing Overloading");

    }
}
