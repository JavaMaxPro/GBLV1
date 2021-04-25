package ru.gb.level1.lessons3;

public class Task3 {
    public static void main(String[] args) {

        int[] mas ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<mas.length; i++) mas[i]=(mas[i]<6)?(mas[i]*2):mas[i];
        for (int ma : mas) System.out.print(ma + " ");
        System.out.println();

    }

}
