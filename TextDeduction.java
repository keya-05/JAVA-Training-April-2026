package com.example.demo;

public class TextDeduction {
    public static void main(String[] args) {
        String text = "Hello World! Welcome to Java programming.";
        String result = text.chars()
            .filter(Character::isLetter)
            .mapToObj(c -> String.valueOf((char) c))
            .reduce("", (a, b) -> a + b);
        System.out.println(result);
    }
}
