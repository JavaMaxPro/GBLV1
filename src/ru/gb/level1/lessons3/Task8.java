package ru.gb.level1.lessons3;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Random ran= new Random();
        int[] mas = new int[ran.nextInt(10+5)];
        for(int i=0;i<mas.length;i++) mas[i]=ran.nextInt(11);
        masOut(mas);
            Scanner sc = new Scanner(System.in);
            System.out.print("Vvedite chislo smesheniya ne ravnoe 0  = ");
        int a;
        a = sc.nextInt();
        if(a>mas.length)a=a%mas.length;
        if(a!=0) sdvigMas(mas, a);
        masOut(mas);
    }

    private static int[] sdvigMas(int[] mas, int a) {
        int num;
        int e=mas.length-1;
        if(a>0) {
            for (int i = 0; i < a; i++) {
                num = mas[e];
                System.arraycopy(mas, 0, mas, 1, e);
                mas[0] = num;
            }
        }
        else{
                for(int i=0;i<Math.abs(a);i++){
                    num=mas[0];
                    if (e >= 0) System.arraycopy(mas, 1, mas, 0, e);
                    mas[e]=num;
                }
            }
        return mas;
        }

    private static void masOut(int[] mas) {
        for (int ma : mas) System.out.print(ma + " ");
        System.out.println();

    }
}
