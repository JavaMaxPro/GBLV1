package ru.gb.level1.lessons3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int max,min;
        Random random = new Random();
        for (int i = 0; i<mas.length; i++) mas[i]=random.nextInt(100);
        for (int ma : mas) System.out.print(ma + " ");
        max=mas[0];
        min=mas[0];
        for (int ma : mas) {
            if (ma > max) max = ma;
            else if (ma < min) min = ma;
        }
        System.out.printf("\n Max numbers = %d, Min number = %d",max,min);
    }

}
