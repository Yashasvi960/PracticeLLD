package com.example.practiceLLD.abstraction;

public class ElectricCar extends Vehicle{
    @Override
    void accelerate(int increment) {
        System.out.println("This is an Electric car");
        currentSpeed+= increment;
        System.out.println("speed after acceleration of an electric car is "+ currentSpeed);
    }

    @Override
    void brake(int decrement) {
        System.out.println("This is an Electric car");
        currentSpeed-= decrement;
        System.out.println("speed after acceleration of an electric car is "+ currentSpeed);
    }
}
