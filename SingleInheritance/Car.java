package com.example.demo;

public class Car {
    private Engine e;
    // Constructor Injection
    Car(Engine ew) {
        this.e=ew;
    }
    public void drive(){
        e.start();
        System.out.println("Driving the Car!");
    }
}
