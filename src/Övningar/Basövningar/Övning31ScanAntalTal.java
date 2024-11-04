package Övningar.Basövningar;

import java.util.Scanner;

public class Övning31ScanAntalTal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Skapar en ny scanner-instans som läser indata.
        String numbers = ""; // String för att lagra talen som en sträng

        System.out.println("Ange ett antal tal och avsluta med 0");

        while (true) {
            int antalTal = scan.nextInt(); // Läser in ett heltal från användaren
            if (antalTal == 0) { // Bryter loopen om talet är 0
                break;
            }
            numbers += antalTal + " "; // Lägger till talet och ett mellanslag till strängen
        }

        System.out.println("Talen är: " + numbers); // Skriver ut alla tal
    }
}
