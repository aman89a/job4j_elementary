package ru.job4j;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String rsl = "";
        int temp = 0;
        if (prizes.length >= num) {
            rsl = prizes[num - 1];
        } else if (prizes.length < num) {
            while (prizes.length < num) {
                num = num - prizes.length;
            }
            rsl = prizes[num - 1];
        }
        return rsl;
    }
}
