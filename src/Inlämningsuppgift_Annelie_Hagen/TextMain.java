package Inlämningsuppgift_Annelie_Hagen;

import java.util.Scanner;

public class TextMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in text rad för rad, avsluta med ordet stop: ");

        Text text = new Text();//Nytt textobjekt sakpas av klassen Text
        // vilket gör att vi kan använda alla metoder i Textklassen.

        while (true){
            String input = scanner.nextLine();
            if (text.isStop(input)){
                break;
            }
            text.addLine(input);
        }
        scanner.close();

        System.out.println("Antal rader, exkl raden med ordet 'stop', är: " + text.getLineCount());
        System.out.println("Antal tecken inklusive mellanslag är: " + text.getCharCount());

    }
}
