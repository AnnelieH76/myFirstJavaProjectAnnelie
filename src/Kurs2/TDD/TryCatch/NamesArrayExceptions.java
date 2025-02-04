package Kurs2.TDD.TryCatch;

import java.util.Scanner;

public class NamesArrayExceptions {

    public static void main(String[] args) {
        String[] names = {"Ada", "Beda", "Cålle"};
        Scanner scan = new Scanner(System.in);

        System.out.println("What index of the array du you want? ");
        try {
            int number = Integer.parseInt((scan.nextLine()));
            System.out.println("Namnet vid önskat index är: " + names[number]);

        } catch (ArrayIndexOutOfBoundsException e) { // Fångar om index är utanför arrayens gränser
            System.out.println("Index är utanför gränserna. Ange ett tal mellan 0-2");
        } catch (NumberFormatException e) { // Fångar om användaren skriver något annat än ett heltal
            System.out.println("Fel: Du måste skriva in ett heltal!");
        } catch (Exception e) { // Fångar andra oväntade fel
            System.out.println("Något gick fel: " + e);
        }

        scan.close(); // Stänger Scanner för att frigöra resurser
    }
}
/*
Följande array finns i ditt program: String[] names = {"Ada", "Beda", "Cålle"};
1. Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen. Fånga eventuella exceptions
2. Uppdatera ditt program så att det fångar exceptions vid olika tillfällen (inläsning av tal respektive utskrift av namn)
 */
