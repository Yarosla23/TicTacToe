package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int f = 0;
        String TicTacToe[][] =
                {{" ", "|", " ", "|", " "},
                        {"-", "+", "-", "+", "-"},
                        {" ", "|", " ", "|", " "},
                        {"-", "+", "-", "+", "-"},
                        {" ", "|", " ", "|", " "},
                };
        Scanner s = new Scanner(System.in);
        Methods.PrintBoard(TicTacToe);
        System.out.println("Выберите режим 1 - одиночная игра, 2 - два игрока");
        int k = s.nextInt();
        if (k == 1) {
            while (Methods.win(TicTacToe) == false) {
                System.out.println("Введите номер клетки 1-9 ");
                int a = s.nextInt();
                if (1 <= a && a <= 9) {
                    if (Methods.GameState(TicTacToe, a, 1) == 0) {
                        Methods.win(TicTacToe);
                        Methods.CompIntelligence(TicTacToe);
                        Methods.PrintBoard(TicTacToe);
                    } else
                        System.out.println("Ячейка занята");
                } else {
                    System.out.println("Неправильно введены данные, введите число от 1-9");
                    Methods.PrintBoard(TicTacToe);
                }
            }
        } else if (k == 2) {
            while (!Methods.win(TicTacToe)) {
                System.out.println("Введите номер клетки 1-9 ");
                int a = s.nextInt();
                System.out.println("Введите 1 - если Х и 2 - если О");
                int symbol = s.nextInt();
                if (1 <= a && a <= 9) {
                    if (Methods.GameState(TicTacToe, a, symbol) == 0) {
                        Methods.win(TicTacToe);
                        Methods.PrintBoard(TicTacToe);
                    } else
                        System.out.println("Ячейка занята");
                } else {
                    System.out.println("Неправильно введены данные, введите число от 1-9");
                    Methods.PrintBoard(TicTacToe);
                }

            }
        }
    }
}
