package Kurs2.TDD.OOPExtends;

public class Frog extends AnimalSuperclass {
    private double distancePerJump;  // Unikt avstånd per hopp för varje groda
    private int numberOfJumps;


    Frog(String name, int age, double distancePerJump, int numberOfJumps) { //Konstruktor
        super(name, age);
        this.distancePerJump = distancePerJump;
        this.numberOfJumps = numberOfJumps;
    }

    public int getAge(){
        return age;
    }

    public void behavior() {
        System.out.println("is jumping.");
    }

    // Metod för att beräkna den totala hoppsträckan
    public double distance() {
        return numberOfJumps * distancePerJump;
    }

}

//Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut
