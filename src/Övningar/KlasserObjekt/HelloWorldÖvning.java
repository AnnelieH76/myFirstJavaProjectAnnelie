package Övningar.KlasserObjekt;

import java.util.Scanner;

public class HelloWorldÖvning
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        //System.out.println(number);
        //System.out.println("Du skrev " + text);



       HelloWorldPrinter hwp = new HelloWorldPrinter ();

        //hwp.print();

        hwp.printManyTimes(number);

    }
}
