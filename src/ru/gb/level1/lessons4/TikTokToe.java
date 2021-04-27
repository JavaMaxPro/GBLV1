package ru.gb.level1.lessons4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TikTokToe {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = 'O';

    private static char[][] map;


    public static void main(String[] args) {
        initMap();
        printMap();

    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print((i)+" ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }


    private static void initMap() {
        map= new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i],DOT_EMPTY);
        }
    }
}
