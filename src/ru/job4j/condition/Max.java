package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int three) {
        return max(three, max(left, right));
    }

    public static int max(int left, int right, int three, int four) {
        return max(four, max(three, max(left, right)));
    }
}
