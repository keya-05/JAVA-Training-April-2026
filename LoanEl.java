package com.example.demo;


public class LoanEl {

    

    public static void main(String[] args) {
        int salary = 30000;
        int creditScore = 0;
        int age = 30;
        int totalExistingEMI=0;
        int loansPaid=0;

        if (salary-totalExistingEMI >= 25000 && age >= 21 && age <= 60) {
            if (loansPaid==0) {
            System.out.println("Accepteddddd");
            }
            else if (creditScore>=700){
                System.out.println("Accepteddddd");
            }
            else {
                System.out.println("Sorry,Nope");
            }
        } else {
            System.out.println("Sorry,Nope");
        }
    }
}
