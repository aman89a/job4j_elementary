package ru.job4j.converter;

import java.sql.SQLOutput;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int outEuro = Converter.rubleToEuro(in);
        int outDollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + outEuro + " euro. Test result : " + (outEuro == expected));
        System.out.println("140 rubles are " + outDollar + " dollar. Test result : " + (outDollar == expected));
    }
}
