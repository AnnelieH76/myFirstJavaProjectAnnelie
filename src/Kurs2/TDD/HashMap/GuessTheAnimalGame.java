package Kurs2.TDD.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GuessTheAnimalGame {
    public static void main(String[] args) {
        // Skapar en HashMap med djurets egenskaper
        HashMap<String, Integer> cowAttributes = new HashMap<>();
        cowAttributes.put("Ben", 4);
        cowAttributes.put("Ögon", 2);
        cowAttributes.put("Svans", 1);
        cowAttributes.put("Magar", 4);
        cowAttributes.put("Klövar", 4);
        cowAttributes.put("Klor", 0);
        cowAttributes.put("Vingar", 0);
        cowAttributes.put("Fenor", 0);
        cowAttributes.put("Tassar", 0);
        cowAttributes.put("Armar", 0);
        cowAttributes.put("Hovar", 0);
        cowAttributes.put("Gälar", 0);
        cowAttributes.put("Öron", 2);
        cowAttributes.put("Munnar", 1);
        cowAttributes.put("Spenar", 4);
        cowAttributes.put("Fingrar", 0);
        cowAttributes.put("Huvud", 1);
        cowAttributes.put("Händer", 0);
        cowAttributes.put("Tår", 0);
        cowAttributes.put("Nos", 1);
        cowAttributes.put("Näsa", 1);
        cowAttributes.put("Mule", 1);


        System.out.println("Välkommen till 'Gissa djuret'!");
        System.out.println("Du ska försöka lista ut vilket djur det är genom att ställa frågor om antal 'kropps'-delar.");
        System.out.println("Du kan fråga t.ex. 'Ben?', 'Ögon?', eller gissa djuret direkt genom att skriva 'en svan'.");

        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Skriv din fråga eller gissning: ");
            String input = scanner.nextLine();

            // Kolla om användaren gissar djuret
            if (input.startsWith("en ")) {
                String guessedAnimal = input.replace("en ", "").trim();
                if (guessedAnimal.equalsIgnoreCase("ko")) {
                    System.out.println("Grattis! Det är en ko! Tack för att du spelade!");
                    guessedCorrectly = true;
                } else {
                    System.out.println("Tyvärr, det är inte en " + guessedAnimal + ". Fortsätt fråga!");
                }
            } else if (input.endsWith("?")) {
                // Extrahera egenskapen från frågan
                String attribute = input.replace("?", "").trim();

                if(attribute.equals("Horn")) {
                    System.out.println("Den kan ha 0 till 2 horn.");
                }
                else if (cowAttributes.containsKey(attribute)) {
                    System.out.println("Det finns " + cowAttributes.get(attribute) + " " + attribute.toLowerCase() + ".");
                } else {
                    System.out.println("Jag vet inte hur många " + attribute + " det har. Prova att fråga om något annat.");
                }
            } else {
                System.out.println("Jag förstod inte din fråga. Fråga t.ex. 'Ben?' eller gissa djuret t.ex 'en svan'.");
            }
        }
        scanner.close();
    }
}