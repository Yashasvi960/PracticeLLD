package com.example.practiceLLD.PaymentSystem;

public class UpiPayment implements PaymentInterface{

    public final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public boolean validate() {
        if(upiId!=null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public PaymentResult pay(double amount) {
        if(!validate()) {
            return new PaymentResult(TransactionStatus.FAILED, "UPI id is not valid");
        } else {
            return new PaymentResult(TransactionStatus.SUCCESS, "The amount of "+ amount+ " has been paid by UPI");
        }
    }
}
