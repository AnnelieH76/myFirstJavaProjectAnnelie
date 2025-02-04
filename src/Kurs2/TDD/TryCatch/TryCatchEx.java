package Kurs2.TDD.TryCatch;

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {

        System.out.println("Skriv ett heltal: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Du skrev nummer " + number);

    }
}
// Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal.

//Läs in fem heltal och lägg dem i en array.
// Se till att inläsningen pågår tills det att användaren har fyllt i fem heltal.
// Användaren ska få ett tydligt felmeddelande om den skriver fel.
