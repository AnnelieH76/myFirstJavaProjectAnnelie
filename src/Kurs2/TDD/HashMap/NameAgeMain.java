package Kurs2.TDD.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameAgeMain {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();

        nameAge.put("Anna", 25);//Namnnet är nyckeln, åldern är värdet
        nameAge.put("Bo", 38);
        nameAge.put("Cilla", 45);
        nameAge.put("Dan", 57);

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv ett namn: ");
        String name = scan.nextLine();
        System.out.println(nameAge.get(name)); //Skriver ut ålder på motsvarande namn

        System.out.println(nameAge); //Skriver ut hela hashmapen (nycklar och värden)

        for (String key : nameAge.keySet()) System.out.print(key + " "); //Skriver ut alla namn (nycklar).
        System.out.println();
        System.out.println("Antal nyckel-värde-par i hashmapen är: " + nameAge.size()); //Skriver ut antal nyckel-värde-par

        // Skriv en ålder och skriv ut motsvarande namn
        System.out.println("Skriv en ålder: ");
        int age = Integer.parseInt(scan.nextLine());

        boolean found = false;
        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {
            if (entry.getValue() == age) {
                System.out.println("Personen med åldern " + age + " är " + entry.getKey() + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ingen person hittades med den åldern.");
        }
        scan.close();
    }
}

 /*Skapa en HashMap för att lagra namn och ålder.
    Lägg till några namn och deras motsvarande ålder.
    Uppdatera programmet så att det skriver ut åldern på det namn man har läst in med Scanner
    och som matchar namn lagrade i din HashMap.

*/