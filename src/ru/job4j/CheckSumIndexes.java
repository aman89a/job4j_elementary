package ru.job4j;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int count = 0;
        int temp = 0;
        int[] array = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    array[count++] = data[i][j];
                }
                temp++;
            }

        }
        return Arrays.copyOf(array, count);
    }
}
