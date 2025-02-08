package Kurs2.TDD.HashMap;

import Övningar.Basövningar.Övning3JämtDelbart;

import java.util.HashMap;
import java.util.Scanner;

public class Simpsons {
    public static void main(String[] args) {
        HashMap<String, String> simpsons= new HashMap<>(); // Skapa en HashMap för Simpsons-karaktärer och deras catchphrases

        Scanner scan =new Scanner(System.in);
        System.out.println("Skriv ett namn: ");
        String name =scan.nextLine();

        simpsons.put("Homer", "D'oh!");
        simpsons.put("Marge", "Hmmm...");
        simpsons.put("Bart", "Eat my shorts!");
        simpsons.put("Lisa", "If anyone wants me, I'll be in my room.");
        simpsons.put("Maggie", "(sucks pacifier)");
        simpsons.put("Mr. Burns", "Excellent!");
        simpsons.put("Ned Flanders", "Okily-dokily!");
        simpsons.put("Krusty the Clown", "Hey hey!");
        simpsons.put("Ralph Wiggum", "I'm in danger!");
        simpsons.put("Chief Wiggum", "Nothing to see here!");


        System.out.println(simpsons.get(name));

        System.out.println(simpsons.get("Marge"));

        //Skriva ut alla karaktärer och deras catchphrases
        for (String character : simpsons.keySet()) {
            System.out.println(character + ": \"" + simpsons.get(character) + "\"");
        }

    }
}
