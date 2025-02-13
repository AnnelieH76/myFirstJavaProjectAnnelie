package Kurs2.TDD.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class NamesArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv några namn, avsluta med ordet 'stop'.");
        while (true) {

            System.out.println("Ange ett namn: ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            names.add(name);
        }

        //Skriver ut alla namn
        System.out.println(names);

        //Skriv över med ett nytt namn på första platsen
        System.out.println("Ange ett nytt namn på första platsen i arrayen");
        String newName = scan.nextLine();
        names.set(0,newName);

        System.out.println(names);

        // Byta plats på första och sista namnet
        int lastIndex = names.size() - 1;
        String temp = names.get(0);
        names.set(0, names.get(lastIndex));
        names.set(lastIndex, temp);

        System.out.println(names);

    }
}

/*
Använd ArrayList för att göra följande:
Spara namn som man läser in
Avsluta sparandet när man skriver stop
Skriva ut alla namnen som har sparats
Skriva över med ett nytt namn på första platsen i ArrayList
Byta plats på första och sista namnet

 */