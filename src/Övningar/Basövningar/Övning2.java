package Övningar.Basövningar;

public class Övning2
{
    public static void main(String[] args)
    {
        //En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.

        int grundlön = 8000;
        int försälningssumma = 87002;
        double bonus = försälningssumma * 0.09;
        double lönesumma = grundlön + bonus;

        System.out.println("Lönen blir totalt: " + lönesumma + " kr");

    }


}
