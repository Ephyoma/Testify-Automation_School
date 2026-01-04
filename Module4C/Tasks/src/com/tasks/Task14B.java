package com.tasks;


    // Create another class "B",set the values of length and breadth.
    // Get the value of the length and breadth and calculate the area.
    // print out your final calculati0n like this. "The area of a sqaure of length: {put the value of the length} and
    // breadth {put the value of the breadth} is {put the value of the area u calculated}"
public class Task14B {
    public static void main(String[] args) {

        Task14A square = new Task14A();

        // Set length and breadth
        square.setLength(6);
        square.setBreadth(3);

        //Get the values

        double length = square.getLength();
        double breadth = square.getBreadth();

        //area calculation

        double area = length * breadth;

        //Print Result

        System.out.println("The area of a square of length: " + length + " and breadth " + breadth + " is " + area);



    }
}
