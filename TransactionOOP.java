package com.example.demo;

import java.util.*;

class BankAccount {
    double balance = 50000;

    void withdraw(double amount) {
        double dailyLimit = 15000;
        if (amount > dailyLimit) {  
            System.out.println("Limit exceeded. Max allowed: ₹" + dailyLimit);
            return;
        }

        if (amount > balance) {
            System.out.println("LOW BALANCE: Transaction failed");
            return;
        }

        double charge = 0;
        if (amount > 10000) {
            charge = amount * 0.02;
        }

        double total = amount + charge;
        balance = balance - total;

        System.out.println("Transaction Approved");
        System.out.println("Charge: ₹" + charge);
        System.out.println("Total Deducted: ₹" + total);
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

public class TransactionOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        System.out.println("Enter amount:");
        double amount = sc.nextDouble();
        acc.withdraw(amount);
    }
}