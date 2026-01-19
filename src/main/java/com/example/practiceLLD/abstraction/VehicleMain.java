package com.example.practiceLLD.abstraction;

public class VehicleMain {

    public static void testDrive(Vehicle vehicle) {
        vehicle.accelerate(50);
        vehicle.brake(10);
        System.out.println(vehicle.getCurrentSpeed());
    }

    public static void main(String[] args) {
        Vehicle gasCar = new GasCar();
        testDrive(gasCar);
        Vehicle electricCar = new ElectricCar();
        testDrive(electricCar);
    }
}
