package com.example.demo;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        list.stream()// 1,2,3,4
                .filter(n -> n % 2 == 0) // 2 % 2== 0 and 4 % 2 == 0
                .map(n -> n * 2) //then 2*2 = 4 and 4*2=8
                .forEach(System.out::println); // prints- 4 and 8 
                // :: scope resolution operator is needed to call the println method of the System.out class

    }

}
