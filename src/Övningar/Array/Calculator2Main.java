package Övningar.Array;

import java.util.Scanner;

public class Calculator2Main {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);//Skapa scannerobjektet

        System.out.print("Skriv in 2 tal med blanksteg mellan ");
        int tal1 = scanner.nextInt(); //Deklarera variabel, läser in nästa tal och sparar i variabeln
        int tal2 = scanner.nextInt();


        System.out.print("Välj räkneset +,-,*,/ ");
        char rakneset = scanner.next().charAt(0);
        //Variabeln raknesat av typen char deklareras. Läser in nästa tecken.
        // CharAt(0) tar första tecknet och sparar det i variabeln raknesat.


        Calculator2 calculator2 = new Calculator2(new int[]{tal1,tal2});
        // Skapar nytt objekt och anropar konstruktorn för klassen Calculator2
        // Skapar ny intiger-array med de två inlästa talen som attribut.

        System.out.println("Svaret blir: " + calculator2.operator(rakneset));
        //Skriver ut text och det returnerade värdet
        // av att objektet anropar metoden operator och skickar in parametern raknesat.
    }
}


/*
// Använd int i stället för string!
(Ändra även till int i Calculator2Test och Calculator2)

Byt ut den sista raden kod till:
int resultat = calculator2.operator(raknesatt);
// Anropar operator-metoden som nu returnerar ett int-värde och lagrar resultatet i variabeln "resultat".

    System.out.println("Svaret blir: " + resultat);
    // Skriver ut text och det returnerade värdet från operator-metoden.

 */