package com.example.practiceLLD.PaymentSystem;

public class PaymentClient {
    private PaymentInterface paymentType;
    private double amount;


    public PaymentClient(PaymentInterface paymentType, double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public void getResult() {
        PaymentResult result = paymentType.pay(amount);
        System.out.println("Status:" + result.getStatus());
        System.out.println("Message:"+ result.getDescription());
    }
}
