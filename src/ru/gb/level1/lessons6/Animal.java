package ru.gb.level1.lessons6;

public class Animal {
    private  String name;
    private  int age;
    private  int run;
    private  int swim;
    private  static int lotAnim=0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        lotAnim++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(int run){
        System.out.println(name+" пробежал "+run+" метров");
    }
    public void swim(int swim){
        System.out.println(name+" проплыл "+swim+" метров");
    }

    public static int getLotAnim() {
        return lotAnim;
    }

    public static void setLotAnim(int lotAnim) {
        Animal.lotAnim = lotAnim;
    }
}
