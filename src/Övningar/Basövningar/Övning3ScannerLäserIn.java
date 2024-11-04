package Övningar.Basövningar;
//Skapa ett program där du läser in antal timmar,
// beräknar och skriver ut hur mycket det blir omvandlat till minuter resp sekunder.

import java.util.Scanner;// importerar scanner-klassen från Javabiblioteket
// som behövs för att kunna läsa in data.

public class Övning3ScannerLäserIn //Deklaration av offentlig klass som heter Övning3

{
    public static void main(String[] args)
    {
        // public betyder att metoden kan anropas från andra klasser,
        // static betyder att metoden tillhör klassen och inte en instans av klassen,
        // och void betyder att metoden inte returnerar något värde.
        // main är huvudmetoden där programmet startar.


        Scanner scan = new Scanner(System.in); //Skapar en ny skanner-instans som läser indata.

        System.out.println("Ange antal timmar: "); //Skriv ut texten

        int antalTimmar = scan.nextInt(); //Deklarerar variabeln antalTimmar av typen integer
        // och läser in heltal och lagrar det i variabeln antalTimmar.


        System.out.println(antalTimmar + " timmar är lika med " + antalTimmar*60 + " minuter eller " + antalTimmar*60*60 + " sekunder.");
    }
}
