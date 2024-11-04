package Övningar.KlasserObjekt;

import java.util.Scanner;

public class myCalculator
{
    public static void main(String[] args)
    {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Skriv in tal 1: ");
        int tal1 =Scanner.nextInt();
        System.out.println("Skriv in tal 2: ");
        int tal2 =Scanner.nextInt();



        Calculator myCalculator = new Calculator(tal1,tal2);
        {
            System.out.println("Summan blir " + myCalculator.add());
            System.out.println("Differensen blir " + myCalculator.sub());
            System.out.println("Kvoten blir " + myCalculator.div());
            System.out.println("Produkten blir " + myCalculator.mult());
        }

    }

}
