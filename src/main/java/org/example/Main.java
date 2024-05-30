package org.example;

import org.example.code.Calculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        calculator.add(1,1);
        calculator.add(1,1);
        calculator.add(1,1);
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}