package ru.gb.level1.lessons3;

import java.util.Random;

public class Task1<random> {
    public static void main(String[] args) {
        int[] mas = new int[8];
        final Random random = new Random();

        for(int i = 0; i<mas.length; i++) mas[i]=random.nextInt(2);
        masOut(mas);

        changeMas(mas);
        masOut(mas);
    }

    private static int[] changeMas(int[] mas) {
        for (int i = 0; i<mas.length; i++) mas[i]=(mas[i]==1)?0:1;
        return mas;
    }

    private static void masOut(int[] mas) {
        for (int ma : mas) System.out.print(ma + " ");
        System.out.println();

    }


}
