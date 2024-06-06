package com.rahul.oops.StaticBinding;

public class SavingAccount extends BankAccount {
    String name = "saving";
    double fed;

    SavingAccount(Double fed) {
        this.fed = fed;
    }

    //method overloading
    public double calculateInterest(double amt, double fed) {
        System.out.println("this is saving account");
        return super.calculateInterest(amt) + (3.10 * amt) / 100;
    }

    //method overriding or static binding
    @Override
    public double getAmount() {
        if (super.getAmount() < 0) {
            return 0.0;
        } else return super.getAmount();
    }
}
