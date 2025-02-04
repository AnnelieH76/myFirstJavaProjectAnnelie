package Kurs2.TDD.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean validInteger = false;
        int number;

        while (!validInteger) {
            try {
                System.out.println("Skriv in ett heltal: ");
                number = scan.nextInt(); // Läser ett heltal direkt
                System.out.println("Number " + number);
                validInteger = true; // Avslutar loopen när vi får en giltig input
            }
            catch (InputMismatchException e){
                System.out.println(e);
                System.out.println("Fel: Det måste vara ett heltal.");
                scan.nextLine(); // Rensar felaktig inmatning så att loopen fortsätter som önskat
                // och du får en ny chans att skriva in heltal. Annars snurrar loopen oändligt.
            }
        }
        scan.close();
    }
}
//1.Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal.
