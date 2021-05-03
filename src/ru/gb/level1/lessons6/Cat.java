package ru.gb.level1.lessons6;

public class Cat extends Animal {

    private  String color;
    private  static int volCat = 0;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        volCat++;
    }

    @Override
    public void run(int run) {
        if(run>200) System.out.println(super.getName() + ": Не побегу, лучше полежу");
        else super.run(run);

    }

    @Override
    public void swim(int swim) {
        System.out.println(super.getName() + ": cам плыви ,а я лучше посмотрю");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getVolCat() {
        return volCat;
    }

    public static void setVolCat(int volCat) {
        Cat.volCat = volCat;
    }
}
