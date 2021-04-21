package ru.gb.level1.lesson2;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println(sumNumbers(2,9));

        definingANumbers(-5);

        System.out.println(numberSign(-7));

        String sl = "Eat meat";
        copyString(sl , 5);

        System.out.println(leapYear(700));


    }

    private static boolean leapYear(int i) {
        return (i%4==0 && i%100!=0) || i%400==0;
    }

    private static void copyString(String sl, int i) {
        for(int j=0 ; j<i ; j++) System.out.println(sl);
    }

    private static boolean numberSign(int i) {
        return i<0;
    }

    private static void definingANumbers(int i) {
        if(i>=0) System.out.println("Number " + i + " positive");
        else System.out.println("Number " + i + " negative");
    }

    private static boolean sumNumbers(int i, int i1) {
        int sum=i+i1;
        return sum>=10 && sum<=20;
    }


}
