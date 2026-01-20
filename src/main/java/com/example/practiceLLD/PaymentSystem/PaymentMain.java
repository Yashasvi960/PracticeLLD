package com.example.practiceLLD.PaymentSystem;

public class PaymentMain {

    public static void main(String[] args) {

        CardPayment card = new CardPayment("1234567890123456", "123");
        UpiPayment upi = new UpiPayment("123");
        PaymentClient client1 = new PaymentClient(card, 120);
        PaymentClient client2 = new PaymentClient(upi, 200);

        client1.getResult();
        client2.getResult();
    }
 }
