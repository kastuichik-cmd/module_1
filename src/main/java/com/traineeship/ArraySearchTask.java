package com.traineeship;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySearchTask {
    public static void main(String[] args) {
        int[] array = new Random().ints(20).toArray();

        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        System.out.println("Максимальное значение: " + findMaxValue(array));

        try (Scanner scanner = new Scanner(System.in)) {
            int target;
            System.out.println("Введите элемент для поиска: ");
            while (true) {
                if (scanner.hasNextInt()) {
                    target = scanner.nextInt();
                    System.out.println("Индекс элемента: " + findElementIndex(array, target));
                    break;
                } else {
                    System.out.println("Ошибка: введено не число, попробуйте еще раз.");
                    scanner.next();

                }
            }
        }
    }

    private static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        int result = array[0];
        for (int i : array) {
            if (i > result) result = i;
        }
        return result;
    }

    private static int findElementIndex(int[] array, int target) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;

        }
        return -1;
    }
}
