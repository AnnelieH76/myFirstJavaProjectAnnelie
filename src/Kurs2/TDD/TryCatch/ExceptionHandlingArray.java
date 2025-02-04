package Kurs2.TDD.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int inputMismatchCount = 0;
        int indexOutOfBoundsCount = 0;

        // Läs in fem heltal
        System.out.println("Ange 5 heltal:");
        int count = 0;
        while (count < 5) {
            try {
                System.out.print("Tal " + (count + 1) + ": ");
                numbers[count] = scanner.nextInt();
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Fel: Endast heltal tillåts!");
                inputMismatchCount++;
                scanner.next(); // Rensar felaktig input
            }
        }

        // Låt användaren välja index att visa tills de skriver "stop"
        while (true) {
            System.out.print("Ange ett index (0-4) för att visa värdet eller 'stop' för att avsluta: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Programmet avslutas...");
                System.out.println("Antal InputMismatchException: " + inputMismatchCount);
                System.out.println("Antal ArrayIndexOutOfBoundsException: " + indexOutOfBoundsCount);
                break;
            }

            try {
                int index = Integer.parseInt(input);
                System.out.println("Värdet på index " + index + " är: " + numbers[index]);
            } catch (NumberFormatException e) {
                System.out.println("Fel: Endast heltal eller 'stop' tillåts!");
                inputMismatchCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Fel: Index utanför tillåtet intervall (0-4)!");
                indexOutOfBoundsCount++;
            }
        }

        scanner.close();
    }
}
/*Läs in fem heltal och lägg dem i en array. Se till att inläsningen pågår tills det att användaren har fyllt i fem heltal.
Användaren ska få ett tydligt felmeddelande om den skriver fel.
Låt användaren välja vilket index de vill se av heltalen.
Hantera ArrayIndexOutOfBoundsException.
Användaren ska kunna använda denna funktionalitet i all oändlighet.
Skriv ut ett informativt felmeddelande om användaren får ett InputMismatchException eller ArrayIndexOutOfBoundsException.
Räkna antalet gånger som respektive felmeddelande uppstår.
Om användaren skriver in stop så ska programmet avslutas och antalet felaktiga input för respektive felmeddelande ska visas.
 */
