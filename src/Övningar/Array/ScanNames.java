package Övningar.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanNames {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Skriv 5 namn, klicka enter efter varje namn:");

        String[] names = new String[5];

        for(int i = 0; i<names.length; i++){
            names[i] = scan.nextLine();
        }

        System.out.println(names[0]);
        System.out.println(names[4]);
    }
}

//Läs in 5 namn i en arrays
//Skriv ut det första och det sista namnet.