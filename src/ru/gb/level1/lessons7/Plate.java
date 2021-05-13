package ru.gb.level1.lessons7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        this.food -= n;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void addFood(int food) {
        this.food += food;
    }
}
