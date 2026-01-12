package com.traineeship;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double num1 = readNumber(scanner, "Введите первое число (или exit): ");
            if (num1 == null) break;

            String operation = readOperation(scanner);
            if (operation == null) break;

            Double num2 = readNumber(scanner, "Введите второе число: ");
            if (num2 == null) break;

            calculate(num1, num2, operation);
        }
        scanner.close();
    }

    private static Double readNumber(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
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
        switch (operation) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> {
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль");
                } else {
                    System.out.println(a / b);
                }
            }
            default -> throw new IllegalStateException("Неизвестная операция: " + operation);
        }
    }
}

