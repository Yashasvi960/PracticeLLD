package com.example.practiceLLD.abstraction;

public class GasCar extends Vehicle{


    @Override
    void accelerate(int increment) {
        System.out.println("This is a GasCar");
        currentSpeed+= increment;
        System.out.println("speed after acceleration of gascar is "+ currentSpeed);
    }

    @Override
    void brake(int decrement) {
        System.out.println("This is a GasCar");
        currentSpeed-= decrement;
        System.out.println("speed after acceleration of gascar is "+ currentSpeed);
    }
}
