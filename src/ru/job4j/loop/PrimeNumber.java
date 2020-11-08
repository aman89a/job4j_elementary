package ru.job4j.loop;

import java.io.OutputStream;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
                System.out.println(number);
            }
        }
        return count;
    }
}
