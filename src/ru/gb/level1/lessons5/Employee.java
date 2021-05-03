package ru.gb.level1.lessons5;

public class Employee {
    private String fio;
    private String post;
    private String email;
    private String number;
    private int salary;
    private int age;


    public Employee(String fio, String post, String email, String number, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void outputConsole(){
        System.out.println(
                "ФИО " +fio+
                "\nДолжность " +post+
                "\nEmail " +email+
                "\nТелефон " +number+
                "\nЗарплата " +salary+
                "\nВозраст " +age+
                        "\n------------------"
                );
    }

    public int getAge() {
        return age;
    }
}
