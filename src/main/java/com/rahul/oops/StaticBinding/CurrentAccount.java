package com.rahul.oops.StaticBinding;

public class CurrentAccount extends BankAccount {
    //we know balance can go to negative as instant loan facility is also available

    @Override
    public double getAmount() {
        System.out.println("from current account");
        return super.getAmount();
    }
}
