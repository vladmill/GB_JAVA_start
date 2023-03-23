package seminars.homework.hw05;

/*
    На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.
*/

public class Task03 {
    public static void setQueen(int[][] board, int i, int j) {
        int d1, d2;
        for (int x = 0; x < 8; x++) {
            board[x][j] += 1;
            board[i][x] += 1;
            d1 = i + j - x;
            d2 = i - j + x;
            if (d1 >= 0 && d1 < board.length) {
                board[d1][x] += 1;
            }
            if (d2 >= 0 && d2 < 8) {
                board[d2][x] += 1;
            }
        }
        board[i][j] = -1;
    }

    public static void delQueen(int[][] board, int i, int j) {
        int d1, d2;
        for (int x = 0; x < 8; x++) {
            board[x][j] -= 1;
            board[i][x] -= 1;
            d1 = i + j - x;
            d2 = i - j + x;
            if (d1 >= 0 && d1 < board.length) {
                board[d1][x] -= 1;
            }
            if (d2 >= 0 && d2 < 8) {
                board[d2][x] -= 1;
            }
        }
        board[i][j] = 0;
    }

    public static void findPosition(int[][] board, int i) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[i][j] == 0) {
                setQueen(board, i, j);
                if (i == 7) {
                    printBoard(board);
                    break;
                } else {
                    findPosition(board, i + 1);
                }
                delQueen(board, i, j);
            }
        }
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("%s  ", board[i][j] >= 0 ? "o" : "x");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 } };

        findPosition(board, 0);
    }
}
