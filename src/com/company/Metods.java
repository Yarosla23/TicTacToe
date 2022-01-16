package com.company;

import java.util.ArrayList;
import java.util.Random;

public  class Metods {
    public static void PrintBoard(String X[][]) {
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print(X[i][j] + " ");
            }
            System.out.println();
        }
    }

        private static int NullBoard(String A[][]) {
         int k = 0;
            for (int i = 0; i < A.length; i = i + 2){
                for (int j = 0; j < A.length; j = j + 2) {
                    if (A[i][j] == " ")
                        k++; }
            }
            return k;
        }

    public static int Input(String TicTacToe[][], int a,int s) {
        int  h = 0;
        String symbol = " ";
        if (s == 1)
            symbol= "X";
        else if  (s == 2)
            symbol= "O";
        switch (a) {
            case 1:
                if (TicTacToe[0][0] == " ")
                    TicTacToe[0][0] = symbol;
                else h = 1;
                break;
            case 2:
                if (TicTacToe[0][2] == " ")
                    TicTacToe[0][2] = symbol;
                else h = 1;
                break;
            case 3:
                if (TicTacToe[0][4] == " ")
                    TicTacToe[0][4] = symbol;
                else h = 1;
                break;
            case 4:
                if (TicTacToe[2][0] == " ")
                    TicTacToe[2][0] = symbol;
                else h = 1;
                break;
            case 5:
                if (TicTacToe[2][2] == " ")
                    TicTacToe[2][2] = symbol;
                else h = 1;
                break;
            case 6:
                if (TicTacToe[2][4] == " ")
                    TicTacToe[2][4] = symbol;
                else h = 1;
                break;
            case 7:
                if (TicTacToe[4][0] == " ")
                    TicTacToe[4][0] = symbol;
                else h = 1;
                break;
            case 8:
                if (TicTacToe[4][2] == " ")
                    TicTacToe[4][2] = symbol;
                else h = 1;
                break;
            case 9:
                if (TicTacToe[4][4] == " ")
                    TicTacToe[4][4] = symbol;
                else h = 1;
                break;
        } return h;
    }

    public static int win(String A[][]) {
        int f = 0;
        for (int i = 0; i < A.length; i = i + 2) {
            if (A[i][0] == A[i][2] && A[i][2] == A[i][4] && A[i][4] == "X") {
                f = 1;
                System.out.println("Win X");
                break;
            }
            if (A[i][0] == A[i][2] && A[i][2] == A[i][4] && A[i][4] == "O") {
                f = 1;
                System.out.println("Win O");
                break;
            }
           if (A[0][i] == A[2][i] && A[2][i] == A[4][i] && A[4][i] == "X") {
                f = 1;
                System.out.println("Win X");
                break;
            }
           if (A[0][i] == A[2][i] && A[2][i] == A[4][i] && A[4][i] == "O") {
                f = 1;
                System.out.println("Win O");
                break;
            }
    }
        if ((A[0][0] == A[2][2] && A[2][2] == A[4][4] || A[0][4] == A[2][2] && A[2][2] == A[4][0]) && A[2][2] == "O") {
            f = 1;
            System.out.println("Win O");
        }
       if ((A[0][0] == A[2][2] && A[2][2] == A[4][4] || A[0][4] == A[2][2] && A[2][2] == A[4][0]) && A[2][2] == "X") {
            f = 1;
            System.out.println("Win X");
        }
        if (NullBoard(A) == 0) {
            f = 1;
            System.out.println("NO WINNER");}
        return f;
    }
    private static int WinPos(String A[][]) {
        int h = 0;
            if (A[0][0] == A[2][2] && A[2][2] == "O" && A[4][4] == " ") {
                A[4][4] = "O";
                h = 1;
            } else if (A[4][4] == A[2][2] && A[2][2] == "O" && A[0][0] == " ") {
                A[0][0] = "O";
                h = 1;
            } else if (A[0][4] == A[2][2] && A[2][2] == "O" && A[4][0] == " ") {
                A[4][0] = "O";
                h = 1;
            } else if (A[4][0] == A[2][2] && A[2][2] == "O" && A[0][4] == " ") {
                A[0][4] = "O";
                h = 1;
            } else for (int i = 0; i < A.length; i = i + 2) {
                if (A[i][0] == A[i][2] && A[i][2] == "O" && A[i][4] == " ") {
                A[i][4] = "O";
                h = 1;
            } else if (A[i][2] == A[i][4] && A[i][2] == "O" && A[i][0] == " ") {
                A[i][0] = "O";
                h = 1;
            } else if (A[i][0] == A[i][4] && A[i][4] == "O" && A[i][2] == " ") {
                A[i][2] = "O";
                h = 1;
            } else if (A[0][i] == A[2][i] && A[2][i] == "O" && A[4][i] == " ") {
                A[4][i] = "O";
                h = 1;
            } else if (A[0][i] == A[4][i] && A[4][i] == "O" && A[2][i] == " ") {
                A[2][i] = "O";
                h = 1;
            } else if (A[2][i] == A[4][i] && A[2][i] == "O" && A[0][i] == " ") {
                A[0][i] = "O";
                h = 1;
            }
        }return h;
    }


    private static int ProtectPos(String A[][]) {
        int h = 0;
        for (int i = 0; i < A.length; i = i + 2) {
     if (A[0][0] == A[2][2] && A[2][2] == "X" && A[4][4] == " ")
    {A[4][4] = "O";h = 1;}
            else if (A[4][4] == A[2][2] && A[2][2] == "X" && A[0][0] == " ")
    {  A[4][4] = "O";h = 1;}
            else if (A[0][0] == A[4][4] && A[4][4] == "X" && A[2][2] == " ")
    {  A[2][2] = "O";h = 1;}
            else if (A[0][4] == A[2][2] && A[2][2] == "X" && A[4][0] == " ")
    {A[4][0] = "O";h = 1;}
            else if (A[4][0] == A[2][2] && A[2][2] == "X" && A[0][4] == " ")
    {   A[0][4] = "O";h = 1;}
            else if (A[0][0] == A[4][4] && A[4][4] == "X" && A[2][2] == " ")
    {  A[2][2] = "O";h = 1;}
            else if (A[i][0] == A[i][2] && A[i][2] == "X" && A[i][4] == " ")
    {  A[i][4] = "O";h = 1;}
            else if (A[i][2] == A[i][4] && A[i][2] == "X" && A[i][0] == " ")
    { A[i][0] = "O";h = 1;}
            else if (A[i][0] == A[i][4] && A[i][4] == "X" && A[i][2] == " ")
    { A[i][2] = "O";h = 1;}
            else if (A[0][i] == A[2][i] && A[2][i] == "X" && A[4][i] == " ")
    {  A[4][i] = "O";h = 1;}
            else if (A[0][i] == A[4][i] && A[4][i] == "X" && A[2][i] == " ")
    { A[2][i] = "O";h = 1;}
            else if (A[2][i] == A[4][i] && A[2][i] == "X" && A[0][i] == " ")
    { A[0][i] = "O";h = 1;}
    }return h;
}

    public static int CompIntelligence(String A[][]) {
        int k = 0, h = 0;
        for (int i = 0; i < A.length; i = i + 2) {
            if (A[2][2] == " "){
                A[2][2] = "O"; h = 1;}
            else if ( WinPos(A) > 0)
            {WinPos(A);h = 1;}
            else if ( ProtectPos(A) > 0)
            {ProtectPos(A);h = 1;}
            else  if (h<1) {
                int n, l, f = 0;

                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(0);
                list.add(2);
                list.add(4);
                while (f < 1) {
                    Random r = new Random();
                    n = list.get(r.nextInt(list.size()));
                    l = list.get(r.nextInt(list.size()));
                    if (A[n][l] == " ") {
                        A[n][l] = "O";
                        f = 1;
                    }
                }
            } break;
        } return h=0;
    }
}