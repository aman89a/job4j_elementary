package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int temp = 0;

        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                temp = (++i) * (++j);
                --j;
                --i;
                table[i][j] = temp;
            }
        }
        return table;
    }
}
