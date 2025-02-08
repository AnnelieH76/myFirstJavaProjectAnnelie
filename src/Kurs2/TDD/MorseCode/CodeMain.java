package Kurs2.TDD.MorseCode;

import java.util.Scanner;

public class CodeMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write something in English or Morse Code: ");
        String input = scan.nextLine();


        String morseCode = Code.getMorseCode(input);
        System.out.println(morseCode);

    }
}
/*
❖ Skriv ett program som gör om morsekod till engelska och engelska till morsekod
❖ Skriv programmet med minst en logikklass samt en klass som läser in text och skriver ut text (med en main-metod). Utveckla programmet i TDD och skriv minst 5 JUnit-testfall
❖ Logik-klass
❖ Main-klass
❖ Test-klass
❖ Skapa minst två felhanteringar i systemet som hanterar två saker som användaren kan göra som går utanför det vanliga användandet av systemet
❖ Använd den internationella morsekoden (se slide 6) för bokstäverna A till Z
❖ Korta och långa signaler ska representeras med punkt (.) och bindestreck (-)
❖ F = ..-.

❖ Flera bokstäver skall gå att hantera men separation av ord behöver inte hanteras
❖ …. . .--- = HEJ
❖ .... . .-.. .-.. --- .-- --- .-. .-.. -.. = HELLOWORLD
❖ HELLO WORLD = .... . .-.. .-.. --- .-- --- .-. .-.. -..
 */