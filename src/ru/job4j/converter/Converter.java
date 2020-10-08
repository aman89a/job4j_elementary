package ru.job4j.converter;

import java.sql.SQLOutput;

public class Converter {

    public static double rubleToEuro(int value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(int value) {
        double rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        double expected = 2;
        double outEuro = Converter.rubleToEuro(in);
        double outDollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + outEuro + " euro. Test result : " + (outEuro == expected));
        System.out.println("140 rubles are " + outDollar + " dollar. Test result : " + (outDollar == expected));
    }
}
