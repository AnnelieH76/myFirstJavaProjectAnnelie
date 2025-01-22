package Kurs2.TDD.SubClasses;

public class SausageSubClass extends MealHuvudklass {



    public SausageSubClass(){
        price = 15;
    }

    public void serve(){
        System.out.println("In a bun");
    }

    public void kindOfFood() {
        System.out.println();
        System.out.println("Sausage");
    }

    public void addKetchup(){
        System.out.println("Adding ketchup");
        price += 2;
    }

}
