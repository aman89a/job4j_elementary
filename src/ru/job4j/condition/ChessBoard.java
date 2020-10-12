package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rslx = 0;
        int rsly = 0;
        rslx = Math.abs(x2 - x1);
        rsly = Math.abs(y2 - y1);
        if (rslx == rsly) {
            return rslx;
        } else if (rslx == 0 && rsly == 0) {
            return 0;
        } else {
            return 0;
        }
    }
}

