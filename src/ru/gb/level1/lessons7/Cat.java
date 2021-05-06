package ru.gb.level1.lessons7;

public class Cat {

    private String name;
    private int appetite;
    boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void eat(Plate p) {
        if ((appetite <= p.getFood())&&(!fullness)) {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println(name +":Муррр я сыт");
        } else System.out.println(name+":Мяу мало еды");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
