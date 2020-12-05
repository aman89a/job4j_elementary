package ru.job4j;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int count = 0;
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                array[count++] = data[i];
            }
        }
        return Arrays.copyOf(array, count);
    }
}
