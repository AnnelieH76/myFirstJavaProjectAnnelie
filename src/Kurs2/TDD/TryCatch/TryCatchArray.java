package Kurs2.TDD.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        System.out.println("Ange 5 heltal:");

        while (count < 5) {
            System.out.print("Tal " + (count + 1) + ": ");
            try {
                numbers[count] = scanner.nextInt(); // Försöker läsa in ett heltal
                count++; // Öka räknaren endast om inmatningen är giltig
            } catch (InputMismatchException e) {
                System.out.println("Fel: Ange endast heltal!");
                scanner.nextLine(); // Rensa den ogiltiga inmatningen
            }
        }

        System.out.println("Du har matat in följande tal:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        /*
        System.out.println("Du har matat in följande tal:");
        for (int num : numbers) {  //For-each-loop
            System.out.print(num + " ");
        }*/
    }
}

//2. Läs in fem heltal och lägg dem i en array.
// Se till att inläsningen pågår tills det att användaren har fyllt i fem heltal.
//Användaren ska få ett tydligt felmeddelande om den skriver fel.

