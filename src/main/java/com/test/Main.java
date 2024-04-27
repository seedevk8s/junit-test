package com.test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calculator = new Calculator();
        int c =calculator.add(10, 2);
        System.out.println(c);
    }
}