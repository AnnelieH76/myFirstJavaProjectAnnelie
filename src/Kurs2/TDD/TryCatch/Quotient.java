package Kurs2.TDD.TryCatch;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        boolean validNumerator = false;
        boolean validDenominator = false;
        double numerator = 1;
        double denominator = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv två tal för att räkna ut kvoten mellan dem");
        while (!validDenominator || !validNumerator) {
            try {
                if (!validNumerator) {
                    System.out.print("Skriv in täljaren: ");
                    numerator = Double.parseDouble(scanner.nextLine());
                    validNumerator = true;
                }
                if (!validDenominator) {
                    System.out.print("Skriv in nämnaren: ");
                    denominator = Double.parseDouble(scanner.nextLine());
                    if (denominator != 0) {
                        validDenominator = true;
                    } else {
                        System.out.println("Nämnaren får inte vara 0. Försök igen: ");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Du kan endast skriva in ett tal");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Något gick fel, försök igen");
            }
        }


        scanner.close();
        double quotient = numerator / denominator;
        System.out.println("Kvoten är :" + quotient);
    }
}

/*Skriv ett program som läser in två tal och sedan skriver ut kvoten mellan dem (dvs. utför division mellan de två talen)
4. Fånga felen och skriv ut ett felmeddelande
5. Uppdatera så att meddelandet i Exception e även kommer med
6. Uppdatera programmet så att det fångar olika fel beroende på vilket Exception man får
7. Uppdatera programmet så att inläsning upprepas till dess att man har korrekta värden
(8. Uppdatera programmet så att man enbart behöver läsa in det värde som inte är korrekt (om enbart ett av dem är inkorrekt))
*/