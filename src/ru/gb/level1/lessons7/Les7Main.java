package ru.gb.level1.lessons7;

public class Les7Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5);
        plate.info();
        cat.eat(plate);
        plate.info();

        plate.addFood(38);
        Cat [] masCat = new Cat[5];
        masCat[0] = new Cat("Murzic", 4);
        masCat[1] = new Cat("Myau", 15);
        masCat[2] = new Cat("Rizik", 10);
        masCat[3] = new Cat("Syam", 6);
        masCat[4] = new Cat("Lisa", 5);

        for (Cat value : masCat) {
            value.eat(plate);
            plate.info();
        }
    }
}
