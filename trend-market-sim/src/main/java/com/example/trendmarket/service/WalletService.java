package com.example.trendmarket.service;

public class WalletService {
    private double balance;

    public WalletService() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean subtractFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}