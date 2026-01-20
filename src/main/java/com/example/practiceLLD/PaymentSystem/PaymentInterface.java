package com.example.practiceLLD.PaymentSystem;

public interface PaymentInterface {

    boolean validate();
    PaymentResult pay(double amount);

}
