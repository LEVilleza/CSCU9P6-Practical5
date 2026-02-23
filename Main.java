package mvcexample;

/**
 *
 
@author savi*/
// Launcher for application

public class Main {

    public static void main(String args[]) {

        String name = "Controller";
        
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, name); // Create first controller
        Controller2 c2 = new Controller2(model, name); // Create second controller
        Controller2 c3 = new Controller2(model, name); // Create second controller
        Controller2 c4 = new Controller2(model, name); // Create second controller

    } // main

} // Main
