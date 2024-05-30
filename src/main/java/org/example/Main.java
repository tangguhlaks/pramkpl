package org.example;

import org.example.code.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Code duplication
        calculator.add(1, 1);
        calculator.add(1, 1);
        calculator.add(1, 1);
        calculator.add(1, 1);

        // Unused variable
        int unusedVariable = 42;

        // Magic numbers and hardcoded strings
        System.out.printf("Hello and welcome!"); // Hardcoded string

        // Duplicate code block
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Duplicate code block
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Poorly structured code
        if (calculator.add(1, 1) == 2) {
            if (calculator.subtract(2, 1) == 1) {
                System.out.println("Nested if statement.");
            }
        }
    }
}
