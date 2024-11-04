package Övningar.Basövningar;

import java.util.Scanner;

public class SwitchLongWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Välj något av följande alternativ A, B, C eller D: ");

        String letter = scan.nextLine();

        switch(letter){
            case "A":
                System.out.println("Acetylsalicylsyra");
                break;
            case "B":
                System.out.println("Baranavårdscentralen");
                break;
            case "C":
                System.out.println("Citronsyracykeln");
                break;
            case "D":
                System.out.println("Djungeltelegrafen");
                break;
            default:
                System.out.println("Felaktigt alternativ");
        }
    }
}
