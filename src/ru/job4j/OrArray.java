package ru.job4j;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {

        if (left.length == 0) {
            if (right.length == 0) {
                return null;
            }
        } else if (left.length != 0 && right.length == 0) {
            return left;
        } else if (right.length == 0 && right.length != 0) {
            return right;
        }
        int count = left.length + right.length;
        int value = 0;
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    value = i;
                    count = count - 2;
                }
            }
        }
        int[] res = new int[count];
        for (int i = 0; i < res.length; i++) {
            if (left[i] == value) {
                res[i] = left[1 - i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        for (int i : or(new int[] {1, 2, 3, 4}, new int[] {1})) {
            System.out.println(i);
        }
    }
}
