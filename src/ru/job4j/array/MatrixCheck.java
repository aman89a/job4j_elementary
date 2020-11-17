package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        int temp = 0;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
