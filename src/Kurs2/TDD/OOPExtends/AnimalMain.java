package Kurs2.TDD.OOPExtends;

public class AnimalMain {

    public static void main(String[] args) {
        double totalDistance;

        // Groda 1: Boll
        Frog frogBoll = new Frog("Boll", 5, 0.5, 6);
        totalDistance = frogBoll.distance();
        System.out.print("The frog " + frogBoll.getName() + " ");
        frogBoll.behavior();
        System.out.println("He jumps a total of " + totalDistance + " meters.");
        System.out.println();


        // Groda 2: Kermit
        Frog frog2 = new Frog("Kermit", 9, 1, 2);
        totalDistance = frog2.distance();
        System.out.print("The frog " + frog2.getName() + " ");
        frog2.behavior();
        System.out.println("He jumps a total of " + totalDistance + " meters.");
        System.out.println();


        // Hund 1: Luffsen
        Dog dog = new Dog("Luffsen", 12);
        System.out.print(dog.getName() + " ");
        dog.behavior();


        //Dinosaurie 1: Trex
        AnimalSuperclass animal = new AnimalSuperclass("Trex", 100000);
        System.out.print(animal.getName() + " ");
        animal.behavior();
    }
}

//Skapa en ny klass med main-metod. I denna klass skapar du två objekt av samma typ (t.ex. Frog) och ge dem olika namn.
//Anropa metoderna som skriver ut deras namn och utför deras beteende
//Läser in två olika parametrar (t.ex. length och numberOfJumps)
//Använd dessa båda parametrar så att de används i metoden (t.ex. skriver ut hur långt grodan hoppar totalt)