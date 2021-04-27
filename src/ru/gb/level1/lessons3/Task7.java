package ru.gb.level1.lessons3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite dlinu massiva = ");
        int len = sc.nextInt();
        int[] mas = new int[len];
        System.out.printf("Vvedite massiv dlinoi = %d :\n ",len);
        for(int i=0;i<len;i++) mas[i]=sc.nextInt();
        for (int ma : mas) System.out.print(ma + " ");
        System.out.println("\n"+leftEqRight(mas));


    }

    private static boolean leftEqRight(int[] mas) {
        int sumRight=0;
        int sumLeft=0;
        if(mas.length>1) {
            for (int ma : mas) sumRight += ma;
            for (int i = 0; i < mas.length; i++) {
                sumLeft += mas[i];
                sumRight -= mas[i];
                if (sumLeft == sumRight) {
                    System.out.print("\nMesto ravenstva ="+(i+1) + "element");
                    return true;
                }
            }
        }
        return false;
    }
}
