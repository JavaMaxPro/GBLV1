package ru.gb.level1.lessons3;

public class Task4 {
    public static void main(String[] args) {
        int[][] mas= new int[10][10];
        for (int i = 0;i<mas.length ;i++) {
            for (int j=0; j<mas[i].length;j++){
              //  mas[i][j]=(i==j)?1:0;
                if ((i==j)||(j == (mas[j].length - i-1))) mas[i][j] = 1;
                else mas[i][j] = 0;
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
    }
}
