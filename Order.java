package com.example.demo;

import java.util.Scanner;

public class Order {
    // the concept which ive used here are ass follows:
    // 1. Arrays
    // 2. For Loops
    // 3. if- condition
    // 4. User Input- scanner
    public static void main(String[] args) {
        int[] prices={500,1200,700,300,5000}; 
        int total= 0;

        if (total < 0) {
            System.out.println("Invalid, Add products to the cart.");
            return;
        }

        for (int i=0; i<prices.length;i++) {
            total+=prices[i];
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you have a coupon? (true/false): ");
        boolean coupon = scanner.nextBoolean();
        if (coupon) {
            total -= 500;
        }

        if (total>5000){
            System.out.println("You have received a coupon: Rs500 off on your next purchase.");
        }
        System.out.println("Total amount without gst to be paid: "+total);
        total += total*0.18f; // adding 18% GST
        


        System.out.println("Total amount with gst to be paid: "+total);
    }
}
