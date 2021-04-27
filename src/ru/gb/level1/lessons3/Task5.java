package ru.gb.level1.lessons3;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite dva znacheniya ");
        int len =sc.nextInt();
        int initalValue=sc.nextInt();
        
        int[] mas= initMas(len,initalValue);
        for (int ma : mas) System.out.print(ma + " ");
        System.out.println();


    }

    private static int[] initMas(int len, int initalValue) {
        int[] mas=new int[len];
        for (int i=0; i <len;i++) mas[i]=initalValue;
        return mas;
    }
}
