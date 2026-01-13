package com.traineeship;

import java.util.Scanner;

public class TicTacToeTask {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        Scanner scanner = new Scanner(System.in);
        int moves = 0;

        while (moves < 9) {
            printBoard();
            System.out.printf("Игрок %c, введите строку (1-3) и столбец (1-3): ", currentPlayer);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row-1][col-1] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                moves++;
            } else {
                System.out.println("Недопустимый ход. Попробуйте снова.");
            }
        }

        printBoard();
        System.out.println("Игра окончена.");
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    private static void printBoard() {
        System.out.println("Поле:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 1 && row <= 3 &&
                col >= 1 && col <= 3 &&
                board[row-1][col-1] == '-';
    }
}
