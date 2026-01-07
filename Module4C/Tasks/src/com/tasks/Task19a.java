package com.tasks;

public class Task19a {
static String name = "Ifeoma";
    public static void main(String[] args) {

        //FINAL: create 3 variables of a class A, ballSize, ballColour, ballTexture.
        // and make it impossible to change the value the ballSize in any method in that class
        final int ballSize = 20;
        String ballColour = "Yellow";
        String ballTexture = "SoftBall";
        System.out.println(ballSize + " " + ballTexture + " " + ballColour);
    }
}
