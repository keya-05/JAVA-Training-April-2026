package com.example.demo;

import java.util.Scanner;

public class EmpSalProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        float taxPercentage = 0.0f;
        if (salary < 0 || taxPercentage < 0) {
            System.out.println("nopeee.");
            return;
        }
        if (salary < 30000) {
            System.out.println(salary+": no tax apploied");
            return;
        }
        else if(30000<= salary && salary <= 70000) {
            taxPercentage = 0.1f;
        }
        else {
            taxPercentage = 0.2f;
        }

        
        float taxAmount = salary * taxPercentage;
        float netSalary = salary - taxAmount;
        System.out.println("Net Salary: " + netSalary );
    }
}
