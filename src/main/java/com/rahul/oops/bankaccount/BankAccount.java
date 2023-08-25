package com.rahul.oops.bankaccount;

// Abstraction , in java Abstraction can be achieved using abstract class or interface
// Abstract class cannot be initialized
// this also adheres with open close principle , open for extension closed for modification
public abstract class BankAccount {
    String name = "XYZ";
    private Integer amount = 0;

    public double getAmount() {
        return this.amount;
    }

    public void addAmount(Integer amt) {
        this.amount = this.amount + amt;
    }

    public void withdrawAmount(Integer amt) {
        this.amount = this.amount - amt;
    }

    public double calculateInterest(double amt) {
        return (5 * amt) / 100;
    }


}
