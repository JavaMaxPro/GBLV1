package ru.gb.level1.lessons6;

public class DemoMain {
    public static void main(String[] args) {
        Animal horse = new Animal("Доди", 6);
        Animal slon = new Animal("Джанго", 15);
        Cat cat1 = new Cat("Рыжик", 1 ,"черный");
        Cat cat2 = new Cat("Арчи", 3 ,"бело-рыжий");
        Cat cat3 = new Cat("Сява", 4 ,"дымчатый");
        Dog dog1 = new Dog("Неро",5,"лабрадор");
        Dog dog2 = new Dog("Юта",2,"лайка");
        Dog dog3 = new Dog("Норд",2,"овчарка");

        cat1.swim(1);
        dog1.run(200);
        dog3.swim(9);
        dog2.swim(15);
        cat1.run(100);
        dog3.run(600);
        cat2.run(300);

        System.out.println("------------------------------");
        System.out.println("Cat создано - " + Cat.getVolCat());
        System.out.println("Dog создано - " + Dog.getVolDog());
        System.out.println("Animal создано - " + Animal.getLotAnim());
    }
}
