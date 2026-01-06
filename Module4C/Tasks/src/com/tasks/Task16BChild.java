package com.tasks;
// Overide the 2 methods in the child class
// and write a diffreent print statement in the body of the overriding method

public class Task16BChild extends Task16BParent{

@Override

// Overriding the father() method from the parent class
// This method provides a different implementation

public void father(){
    System.out.println("The father provides guidance and protection");

    // Overriding the mother() method from the parent class
    // This method provides a different implementation

}
@Override
    public  void  mother(){

        System.out.println("The mother takes care of the family with love");

    }
    // Main method: program execution starts here
    public static void main(String[] args) {
        Task16BChild jude = new Task16BChild();

        // Calling the overridden methods
        jude.father();
        jude.mother();
    }
}
