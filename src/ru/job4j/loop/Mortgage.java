package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        long summ = amount + ((amount * Math.round(percent)) / 100);
        while(summ >= 0){
            summ = summ - salary;
            year++;
        }
        return year;
    }
}
