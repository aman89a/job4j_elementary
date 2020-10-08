package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = (x1 - x2);
        double y = (y1 - y2);
        double qvadX = Math.pow(x, 2);
        double qvadY = Math.pow(y, 2);
        double rsl = Math.pow(qvadX + qvadY, 2);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 2, 2, 0);
        double result2 = Point.distance(-7, 3, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 2) to (2, 0) " + result1);
        System.out.println("result (-7, 3) to (2, 0) " + result2);
    }
}
