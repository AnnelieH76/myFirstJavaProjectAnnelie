package Kurs2.TDD.OopVehicle;

import java.util.Scanner;

public class RaceMain {
    public static void main(String[] args) {

        /*
        CarSubClass car = new CarSubClass();
        System.out.println("Bilens hastighet: ");car.showSpeed();// Skriver ut 0
        car.increaseSpeed(2);// Ökar med
        System.out.println();car.showSpeed(); // Skriver ut 2
        System.out.println();car.increaseSpeed(10); //Ökar med
        System.out.println();car.showSpeed(); //Skriver ut 12
         */

        BicycleSubClass bike = new BicycleSubClass();
        System.out.println("Snygg cykel!");
        System.out.println("Hur många växlar har din cykel? ");
        Scanner scan = new Scanner(System.in);
        int gears = Integer.parseInt(scan.nextLine());
        bike.nbrOfGears(gears);
        bike.increaseSpeed(gears * 2);

        if (gears >= 1 && gears <= 21) {
            System.out.println("Med din högsta växel kan du cykla ");
            bike.showSpeed();
        }
        scan.close();
    }
}

//Skapa en huvudklass Vehicle
//I Vehicle skapa ett publikt attribut speed
//Skapa en metod showSpeed() i Vehicle
//Skapa en underklass Car som ärver ifrån Vehicle
//Skapa en metod increaseSpeed(int increment) som ökar speed
//Skapa en klass Race som har en main-metod och som skapar en Car. Öka hastigheten och skriv ut den med metoderna ovan

//Lägg till en ny klass Bicycle som ärver ifrån Vehicle
//Bicycle har en egen metod nbrOfGears(int nbr) där man kan ställa in hur många växlar den har
//increaseSpeed(int force) ökar speed för cykeln beroende på vilken växel man har. En högre växel ökar speed mer än en låg växel
//Använd metoderna ovan och ställ in antal växlar och öka hastigheten på cykeln och skriv ut hastigheten i klassen Race
