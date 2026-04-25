package com.example.AOP;

public class Bank {
    public void logBefore() {
        System.out.println("[LOG] Starting Bank Operation.");
    }

    public void logAfter() {
        System.out.println("[LOG] Completed Bank Operation. ");
    }

}