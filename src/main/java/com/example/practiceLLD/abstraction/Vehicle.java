package com.example.practiceLLD.abstraction;

abstract class Vehicle {

    protected int currentSpeed;

    abstract void accelerate(int increment);
    abstract void brake(int decrement);

    public int getCurrentSpeed() {
        return currentSpeed;
    }

}
