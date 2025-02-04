package Kurs2.TDD.OOPExtends;

public class Dog extends AnimalSuperclass{

    Dog(String name, int age) {
        super(name, age);
    }

    public void behavior() {
        System.out.println("Run");
    }
}

//Skapa en till klass som representerar ett annat djur (t.ex. Dog) med en liknande struktur som i OOP Frog.

