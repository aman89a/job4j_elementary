package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) && !isPositive(num);
    }

    public static void main(String[] args) {
        System.out.println(new LogicNot().isEven(8));
        System.out.println(new LogicNot().isPositive(8));
        System.out.println(new LogicNot().notEven(8));
        System.out.println(new LogicNot().notPositive(8));
        System.out.println(new LogicNot().notEvenAndPositive(8));
        System.out.println(new LogicNot().evenOrNotPositive(-8));
    }

}
