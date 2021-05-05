package ru.gb.level1.lessons5;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[]  employArray = new Employee[5] ;
        employArray[0]= new Employee("Ivanov Ivan","Engineer","ivanov@mail.com","892312312",30000,30);
        employArray[1]= new Employee("Petrov Ivan","Engineer","Petrov@mail.com","892312374",30000,45);
        employArray[2]= new Employee("Sidorov Ivan","Engineer","Sidorov@mail.com","892312252",30000,38);
        employArray[3]= new Employee("Grebanov Ivan","Engineer","Grebanov@mail.com","892358312",30000,20);
        employArray[4]= new Employee("Vovasnov Ivan","Engineer","op@mail.com","892312462",30000,55);

        for (int i = 0; i < 5; i++) {
            if(employArray[i].getAge()>40)employArray[i].outputConsole();

        }
    }
}
