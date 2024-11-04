package Övningar.Basövningar;

public class Övning1AreaOmkrets
{

    public static void main(String[] args)
    {
       /* Skapa ett program som använder tre tal
       Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.
       */

        int number1 = 5, number2 = 10, number3 = 15, summa;
        summa = number1 + number2 + number3;
        System.out.println("Summan är: " +summa);
        System.out.println("Medelvärdet är: " +summa/3);


        /*
       Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        */


       int höjd = 8, längd = 4;
       int area = höjd*längd;
       int omkrets = höjd*2 +längd*2;

        System.out.println("Arean är: " +area);
        System.out.println("Omkretsen är: " +omkrets);



         /*
       Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
       Rektangelns sidor ska läsas in.

        import java.util.Scanner;

        public class Rektangel {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Läs in rektangelns sidor
                System.out.print("Ange rektangelns bredd: ");
                double bredd = scanner.nextDouble();
                System.out.print("Ange rektangelns höjd: ");
                double höjd = scanner.nextDouble();

                // Beräkna area och omkrets
                double area = bredd * höjd;
                double omkrets = 2 * (bredd + höjd);

                // Skriv ut resultat
                System.out.println("Rektangelns area är: " + area);
                System.out.println("Rektangelns omkrets är: " + omkrets);
          */

    }

}



