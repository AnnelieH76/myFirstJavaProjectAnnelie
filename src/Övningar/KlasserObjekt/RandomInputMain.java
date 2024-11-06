package Övningar.KlasserObjekt;

import java.util.Scanner;

public class RandomInputMain{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ange ett tal: ");
        int n = scan.nextInt();

        RandomInput randomInput = new RandomInput(n);
        System.out.println("Ett slumpmässigt tal mellan 0 och " + n + " är: " + randomInput.generateRandomNumber());

    }
}
