package com.example.practiceLLD.PaymentSystem;

public class CardPayment implements  PaymentInterface{

    private final String cardNumber;
    private final String cvv;

    public CardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    @Override
    public boolean validate() {
        if(cardNumber!=null && cardNumber.length()==16 && cvv!=null && cvv.length()==3) {
            System.out.println("Card Payment with transaction status: "+ TransactionStatus.SUCCESS);
            return true;
        } else {
            System.out.println("Card Payment with transaction status: "+ TransactionStatus.FAILED);
        }
        return false;
    }

    @Override
    public PaymentResult pay(double amount) {
       if(!validate()) {
           return new PaymentResult(TransactionStatus.FAILED, "The card is not eligible to pay");

       } else {
           return new PaymentResult(TransactionStatus.SUCCESS, "The amount of "+ amount+ " has been paid by card");
       }
    }

}
