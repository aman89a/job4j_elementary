package ru.job4j;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        char[] array = String.valueOf(number).toCharArray();
        int[] rsl = new int[array.length];
        rsl[0] = Integer.parseInt(String.valueOf(array[array.length - 1]));
        for (int i = 1; i < array.length; i++) {
            rsl[i] = Integer.parseInt(String.valueOf(array[array.length - i - 1]));
            System.out.println(i);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] arr = resolve(123456);
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.println(arr[i]);

        }
    }
}
