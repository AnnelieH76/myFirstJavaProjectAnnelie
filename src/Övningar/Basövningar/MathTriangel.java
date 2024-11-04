package Övningar.Basövningar;

import java.util.Scanner;

public class MathTriangel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange sidan a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Ange sidan b: ");
        int b = Integer.parseInt(scanner.nextLine());


        double c = Math.sqrt(a*a + b*b);

        System.out.println("Hypotenusan är: " + c );



    }
}
