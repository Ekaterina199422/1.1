package com.company;


import java.util.Scanner;
​

public class Main {

    public static void main(String[] args) {

        char[][] motions = new char[3][3];

​

        Scanner scanner = new Scanner(System.in);


        printField(motions);​

        for (int i = 0; i < 9; i++) {

            System.out.println("Ход игрока 1, введите коодинаты Х (через пробел)");

            int x1 = scanner.nextInt();

            int y1 = scanner.nextInt();

            if (checkField(motions[x1][y1])) {

                System.out.println("Данные координаты уже заняты");

                i--;

            } else {

                motions[x1][y1] = 'X';

            }

            printField(motions);

            if (checkStatus(motions)) {

                break;

            }​

            System.out.println("Ход игрока 2, введите коодинаты O (через пробел)");

            int x2 = scanner.nextInt();

            int y2 = scanner.nextInt();

            if (checkField(motions[x2][y2])) {

                System.out.println("Данные координаты уже заняты");

                i--;

            } else {

                motions[x2][y2] = 'O';

            }

​

            printField(motions);

            if (checkStatus(motions)) {

                break;

            }

        }

​

        System.out.println("Игра закончена");

    }

​

    public static boolean checkField(char ch) {

        return ch == 'X' || ch == 'O';

    }
    ​
    public static boolean checkStatus(char[][] motions) {

        //lines

        if (motions[0][0] != 0 && motions[0][0] == motions[0][1] && motions[0][1] == motions[0][2]) {

            System.out.printf("Выиграл %s\n", motions[0][1]);

            return true;

        }

        if (motions[1][0] != 0 && motions[1][0] == motions[1][1] && motions[1][1] == motions[1][2]) {

            System.out.printf("Выиграл %s\n", motions[1][0]);

            return true;

        }

        if (motions[2][0] != 0 && motions[2][0] == motions[2][1] && motions[2][1] == motions[2][2]) {

            System.out.printf("Выиграл %s\n", motions[2][0]);

            return true;

        }


        if (motions[0][0] != 0 && motions[0][0] == motions[1][0] && motions[1][0] == motions[2][0]) {

            System.out.printf("Выиграл %s\n", motions[0][0]);

            return true;

        }

        if (motions[0][1] != 0 && motions[0][1] == motions[1][1] && motions[1][1] == motions[2][1]) {

            System.out.printf("Выиграл %s\n", motions[1][0]);

            return true;

        }

        if (motions[0][2] != 0 && motions[0][2] == motions[1][2] && motions[1][2] == motions[2][2]) {

            System.out.printf("Выиграл %s\n", motions[2][0]);

            return true;

        }


        if (motions[0][0] != 0 && motions[0][0] == motions[1][1] && motions[1][1] == motions[2][2]) {

            System.out.printf("Выиграл %s\n", motions[0][0]);

            return true;

        }

        if (motions[0][2] != 0 && motions[0][2] == motions[1][1] && motions[1][1] == motions[2][0]) {

            System.out.printf("Выиграл %s\n", motions[0][0]);

            return true;

        }

        return false;

    }

    public static void printField(char[][] motions) {

        for (char[] motion : motions) { //for (int i = 0; i < motions.length; i++) {

            for (char c : motion) { // for (int j = 0; j < motions[i].length; j++) {

                System.out.printf("%s ", c); // char c = motions[i][j])

            }

        }


    }
}

