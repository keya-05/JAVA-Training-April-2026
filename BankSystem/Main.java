package com.example.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[]args) {
        ApplicationContext as2= new ClassPathXmlApplicationContext("application.xml");
        BankService bank= (BankService) as2.getBean("bankService", BankService.class);
        bank.deposit();
        bank.withdraw();
    }
}
