package com.example.practiceLLD.PaymentSystem;

public class PaymentResult {

    TransactionStatus status;
    String description;

    public PaymentResult(TransactionStatus status, String description) {
        this.status = status;
        this.description = description;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
