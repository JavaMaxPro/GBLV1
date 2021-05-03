package ru.gb.level1.lessons6;

public class Dog extends Animal {
    private  String poroda;
    private  static int volDog = 0;

    public Dog(String name, int age, String poroda) {
        super(name, age);
        this.poroda = poroda;
        volDog++;
    }

    @Override
    public void run(int run) {
        if(run>500) System.out.println(super.getName()+" - zzzzz....zzz...");
        else super.run(run);
    }

    @Override
    public void swim(int swim) {
        if(swim>10) System.out.println(super.getName() + " - Gav gav");
        else super.swim(swim);
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public static int getVolDog() {
        return volDog;
    }

    public static void setVolDog(int volDog) {
        Dog.volDog = volDog;
    }


}
