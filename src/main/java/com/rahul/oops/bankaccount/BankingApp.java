package com.rahul.oops.bankaccount;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new SavingAccount(3.0);
        //Dynamic dispatch
        System.out.println(account.calculateInterest(200000));
        System.out.println(account.name);
        BankAccount account1 = new CurrentAccount();
        account1.withdrawAmount(2000);
        System.out.println(account1.getAmount());
    }
}
