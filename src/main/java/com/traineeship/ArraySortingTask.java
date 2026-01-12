package com.traineeship;

import java.util.Arrays;
import java.util.Random;

public class ArraySortingTask {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 10).toArray();
        System.out.println("Исходный массив: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        boolean swapped;
        for (int e = 0; e < array.length - 1; e++) {
            swapped = false;
            for (int i = 0; i < array.length - e - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

}


