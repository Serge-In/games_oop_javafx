package ru.job4j.puzzle;

public class Win {
    /**
     * 6.7.1. Моно строка в матрице. [#214126]
     * Проверяет заполнение строки массива символов
     * возвращает true, если в заданной строке массива содержатся только 1, иначе - false
     * 2023-04-03
     */
    public static boolean monoHorizontal(int[][] board, int row) {
        for (int el : board[row]) {
            if (el != 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 6.7.2. Моно столбец в матрице. [#214127]
     * Проверяет заполнение колонки массива символов
     * возвращает true, если в заданной колонке массива содержатся только 1, иначе - false
     * 2023-04-03
     */
    public static boolean monoVertical(int[][] board, int column) {
        for (int[] row : board) {
            if (row[column] != 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 6.7.4. Выигрышные комбинации в сокобан [#53859]
     * Проверяет двумерный 5*5 массив char на заполнение строки или столбца символами 1.
     * 2023-04-03
     */
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                return true;
            }
        }
        return false;
    }
}
