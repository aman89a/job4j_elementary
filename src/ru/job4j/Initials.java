package ru.job4j;

public class Initials {
    public static String convert(String[] fio) {
        String rsl = fio[0] + " ";
        for (int i = 1; i < fio.length; i++) {
            rsl += fio[i].charAt(0);
            rsl += ".";
        }
        return rsl;
    }
}
