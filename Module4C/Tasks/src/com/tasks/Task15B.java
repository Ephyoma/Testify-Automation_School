package com.tasks;

//Task: Create a parent class "A" with 3 methods.
// create a child class "B" with 2 methods.
// add a print statement in all the 5 methods.
// Invoke all 5 methods in a main method in the child class "B"

public class Task15B extends  Task15A{

    // Child class methods
    public void bestSon() {
        System.out.println("Best son ever");
    }

    public void obedientSon() {
        System.out.println("An obedient son");
    }

    public static void main(String[] args) {
        Task15B bestSon = new Task15B();
        bestSon.bestDad();
        bestSon.supportiveDad();
        bestSon.caringDad();
        bestSon.bestSon();
        bestSon.obedientSon();





    }
}
