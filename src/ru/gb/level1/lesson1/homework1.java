package ru.gb.level1.lesson1;

public class homework1 {
    public static void main(String[] args)
    {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a=3 ,b =20;
        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    private static void printColor() {
        int value = 54;
        if (value>100) System.out.println("Green");
        else
        {
            if (value <= 0) System.out.println("Red");
            else System.out.println("Yellow");
        }
    }

    private static void checkSumSign() {
        int a=5 , b=7;
        if((a+b)>=0) System.out.println("Summa pologitelnaya");
        else System.out.println("Summa otricatelnaya");
    }

    private static void printThreeWords() {
        System.out.println("Orange,\nBanana,\nApple!");
    }
}
