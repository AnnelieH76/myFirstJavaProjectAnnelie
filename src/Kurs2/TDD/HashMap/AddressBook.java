package Kurs2.TDD.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    // Klass för att lagra gatuadress och postnummer
    static class Address {
        private String streetAddress;
        private int postalCode;

        // Konstruktor
        public Address(String streetAddress, int postalCode) {
            this.streetAddress = streetAddress;
            this.postalCode = postalCode;
        }

        // Metod för att hämta gatuadressen
        public String getStreetAddress() {
            return streetAddress;
        }

        // Metod för att hämta postnumret
        public int getPostalCode() {
            return postalCode;
        }

        @Override
        public String toString() {
            return "Gatuadress: " + streetAddress + ", Postnummer: " + postalCode;
        }
    }

    public static void main(String[] args) {
        // Skapar en HashMap för att lagra namn och deras adresser
        HashMap<String, Address> addressMap = new HashMap<>();

        // Lägger till några exempeldata
        addressMap.put("Anna", new Address("Storgatan 1", 12345));
        addressMap.put("Erik", new Address("Långgatan 23", 67890));
        addressMap.put("Sara", new Address("Kyrkogatan 12", 54321));

        // Skapar en Scanner för att ta emot användarens inmatning
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv ett namn för att hämta gatuadress och postnummer: ");
        String name = scanner.nextLine();

        // Kollar om namnet finns i HashMapen
        if (addressMap.containsKey(name)) {
            Address address = addressMap.get(name);
            System.out.println("Information för " + name + ": " + address);
        } else {
            System.out.println("Ingen information hittades för namnet: " + name);
        }

        scanner.close();
    }
    /*HashMap
Skapa en egen klass där man i två attribut sparar både gatuadress (String) och postnummer (int)
Skapa metoder för att hämta både gatuadressen och postnumret
Spara namn, gatuadress och postnummer i en hashmap med namn som nyckel
Skapa ett program där man kan skriva ut både gatuadress och postnummer när man söker på ett namn
*/
}
