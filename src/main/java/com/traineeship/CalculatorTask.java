package com.traineeship;

import java.util.Scanner;

public class CalculatorTask {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                Double num1 = readNumber(scanner, "Введите первое число (или exit): ");
                if (num1 == null) break;

                String operation = readOperation(scanner);
                if (operation == null) break;

                Double num2 = readNumber(scanner, "Введите второе число: ");
                if (num2 == null) break;

                calculate(num1, num2, operation);
            }
        }
    }

    private static Double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (true) {
            String input = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(input)) return null;
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число");
            }
        }
    }

    private static String readOperation(Scanner scanner) {
        while (true) {
            System.out.println("Введите операцию (+, -, *, /)");
            String operation = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(operation)) return null;

            if (operation.matches("[+\\-*/]")) {
                return operation;
            }
            System.out.println("Ошибка: неизвестная операция");
        }
    }

    private static void calculate(double a, double b, String operation) {
        double result;
        switch (operation) {
            case "+" -> result = add(a, b);
            case "-" -> result = subtract(a, b);
            case "*" -> result = multiply(a, b);
            case "/" -> result = divide(a, b);
            default -> throw new IllegalStateException("Неизвестная операция: " + operation);
        }
        System.out.println(result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }
}

