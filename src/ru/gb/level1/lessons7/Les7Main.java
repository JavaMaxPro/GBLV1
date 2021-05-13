package ru.gb.level1.lessons7;

import java.util.Locale;

public class Les7Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5);
        plate.info();
        cat.eat(plate);
        plate.info();

        plate.addFood(38);
        Cat[] masCat = new Cat[5];
        masCat[0] = new Cat("Murzic", 4);
        masCat[1] = new Cat("Myau", 15);
        masCat[2] = new Cat("Rizik", 10);
        masCat[3] = new Cat("Syam", 6);
        masCat[4] = new Cat("Lisa", 5);

        for (Cat value : masCat) {
            value.eat(plate);
            plate.info();
        }

        enterText("I like Java!!!");
    }

    public static void enterText(String text) {
        System.out.println(text.charAt(text.length() - 1));
        if (text.endsWith("!!!")) System.out.println("Заканчивается на !!!");
        if (text.startsWith("I like")) System.out.println("Начинается на I like");
        if (text.contains("Java")) System.out.println("Содержит слово Java в тексте");
        System.out.println("Позиция Java = " + text.indexOf("Java"));
        System.out.println(text.replace('a', 'o'));
        System.out.println(text.toLowerCase(Locale.ROOT));
        System.out.println(text.toUpperCase(Locale.ROOT));
        System.out.println((text.substring(0, text.indexOf("Java")) + text.substring(text.indexOf("Java") + 4)));
    }
}
