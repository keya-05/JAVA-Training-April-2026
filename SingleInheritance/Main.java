package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ApplicationContext ac;
        ac=new ClassPathXmlApplicationContext("application.xml");
        Car car=(Car)ac.getBean("car");
        car.drive();

    }

}