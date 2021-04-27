package ru.gb.level1.lessons3;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i = 0; i<mas.length; i++) mas[i]=i+1;
        for (int ma : mas) System.out.print(ma + " ");
        System.out.println();
    }
}
