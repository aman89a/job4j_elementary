package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int temp = money - price;
            for (int i = 0; i < coins.length; i++) {
                while ((temp - coins[i]) >= 0) {
                    temp -= coins[i];
                    rsl[size] = coins[i];
                    size++;
                    break;
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
