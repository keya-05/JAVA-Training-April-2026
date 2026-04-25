package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Order {
	int id;
	String name;
	double amount;
	double rating;
	double distance;

	Order(int id, String name, double amount, double rating, double distance) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.rating = rating;
		this.distance = distance;
	}
}

public class OrderSystem {
    public static void main(String[] args) {
        List<Order> orders= Arrays.asList(
            new Order(1,"Rahul",600,4,3),
            new Order(2,"Rohit",500,3.5,5),
            new Order(3,"Neha",700,4.5,2)
        );
        List<String> result = new ArrayList<>();


        orders.stream()
            .filter(o -> o.amount > 500 && o.rating >= 4)
                .map(o -> {
                    double discount = (o.distance < 5) ? 0.10 : 0.05;
                    double finalAmount = o.amount - (o.amount * discount);
                    return o.id + " -> " + o.name + " -> " + finalAmount;
                })
                .forEach(result::add);
        for(String res : result) {
            System.out.println(res);    
            }
        if (result.isEmpty()) {
            System.out.println("No orders found matching the criteria.");
        }


    }
}