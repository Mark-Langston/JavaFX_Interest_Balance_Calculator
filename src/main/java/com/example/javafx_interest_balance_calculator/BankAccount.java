package com.example.javafx_interest_balance_calculator;

public class BankAccount {
    private double balance;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void calculateFinalBalance(double annualInterestRate, int years) {
        balance *= Math.pow(1 + annualInterestRate / 100, years);
    }
}