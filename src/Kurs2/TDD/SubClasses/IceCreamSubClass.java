package Kurs2.TDD.SubClasses;

public class IceCreamSubClass extends MealHuvudklass {

    public IceCreamSubClass() {
        price = 20;
    }

    public void serve() {
        System.out.println("In a cone");
    }

    public void kindOfFood() {
        System.out.println();
        System.out.println("Ice cream");
    }

    public void addSprinkles() {
        System.out.println("Adding sprinkles");
        price += 5;
    }
}

