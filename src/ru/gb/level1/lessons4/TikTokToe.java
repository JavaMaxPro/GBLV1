package ru.gb.level1.lessons4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TikTokToe {
    private static final int SIZE = 5;
    private static final int NUMBEROFWINS = 4;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = 'O';

    private static char[][] map = new char[SIZE][SIZE];


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }


            if (computerTurnVirtual()) printMap();
            else {
                computerTurn();
                printMap();
            }

            if (isWin(DOT_X))
                if (isWin(DOT_0)) {
                    System.out.println("Компьютер победил");
                    break;
                }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWin(char symbol) {

        int s = SIZE - NUMBEROFWINS;
        if (getDiagVertik(symbol, s)) return true;

        Boolean x = getaDioganal(symbol, s);
        if (x != null) return x;


        /*
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
*/
        return false;
    }

    private static boolean getDiagVertik(char symbol, int s) {
        int gorizont;
        int vertikal;
        int z, t;
        for (int i = 0; i < SIZE; i++) {
            gorizont = 1;
            vertikal = 1;
            for (int j = 0; j < SIZE - 1; j++) {
                if (map[i][j] == map[i][j + 1] && map[i][j] == symbol) gorizont++;
                else gorizont = 1;
                if (gorizont == (SIZE - s)) return true;

                if (map[j][i] == map[j + 1][i] && map[j][i] == symbol) vertikal++;
                else vertikal = 1;
                if (vertikal == (SIZE - s)) return true;
            }

        }
        return false;
    }

    private static Boolean getaDioganal(char symbol, int s) {
        int z;
        int t;
        int diagonal;
        int diagonalobr;
        z = s;
        t = 0;
        while (true) {

            diagonal = 0;
            diagonalobr = 0;
            for (int i = 0; i < SIZE; i++) {
                if ((i + z < SIZE) && (i + t < SIZE)) {
                    if (map[i + z][i + t] == symbol) {
                        diagonal++;
                        if (diagonal == (SIZE - s)) return true;
                    } else diagonal = 0;
                    if (map[i + z][SIZE - 1 - i - t] == symbol) {
                        diagonalobr++;
                        if (diagonalobr == (SIZE - s)) return true;
                    } else diagonalobr = 0;
                } else continue;
            }
            if ((z <= 0) && (t == s)) break;
            if (z <= 0) t++;
            else z--;

        }
        return null;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите координату x y");
            x = readInt(scan);
            y = readInt(scan);

            if (x == -1 || y == -1) {
                System.out.println("Координаты должны быть числом");
                scan.nextLine();
            } else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные ведены не корректно!");
            } else if (map[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята!");
            } else {
                break;
            }
        } while (true);
        map[x][y] = DOT_X;
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (map[x][y] != DOT_EMPTY);
        map[x][y] = DOT_0;
    }

    private static boolean computerTurnVirtual() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_X;
                    if (isWin(DOT_X)) {
                        map[i][j] = DOT_0;
                        return true;
                    } else map[i][j] = DOT_EMPTY;
                }
            }
        }
        return false;

    }

    private static int readInt(Scanner scan) {
        return scan.hasNextInt() ? scan.nextInt() - 1 : -1;
    }

    private static void printMap() {

        printHeader();
        printBody();
        System.out.println();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print((i) + " ");
        }
        System.out.println();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }
}
