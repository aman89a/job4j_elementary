package ru.job4j;

import java.util.Arrays;
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (i > left.length - 1) {
                int a = right[j];
                rsl[k] = a;
                j++;
            } else if (j > right.length - 1) {
                int a = left[i];
                rsl[k] = a;
                i++;
            } else if (left[i] < right[j]) {
                int a = left[i];
                rsl[k] = a;
                i++;
            } else {
                int a = right[j];
                rsl[k] = a;
                j++;
            }
        }
        return rsl;
    }
}
