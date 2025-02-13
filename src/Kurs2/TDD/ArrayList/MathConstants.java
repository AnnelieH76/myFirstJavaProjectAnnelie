package Kurs2.TDD.ArrayList;

/*
Spara dessa matematiska konstanter med sina första 10 decimaler i en ArrayList. Skriv sen ut alla genom att hämta dem ifrån ArrayListen
Namn	Värde
pi		3.1415926535
e		2.7182818284
sqrt2	1.4142135623
phi		1.6180339887
ln10	2.3025850929
*/

import java.util.ArrayList;
import java.math.BigDecimal; //hantera tal med hög precision
import java.math.RoundingMode; //specificera avrundningsregler

public class MathConstants {

    public static void main(String[] args) {
        ArrayList<Double> constants = new ArrayList();
        constants.add(roundToTenDecimals(Math.PI));
        constants.add(roundToTenDecimals(Math.E));
        constants.add(roundToTenDecimals(Math.sqrt(2)));
        constants.add(1.6180339887);
        constants.add(2.3025850929);

        System.out.println("Matematiska konstanter (sparade med 10 decimaler): ");
        System.out.println(constants);

        //Lägg till och testa fler funktioner
        System.out.println();
        System.out.println("Fler funktioner testas!\n");

        System.out.println(constants.indexOf(1.4142135623));
        System.out.println("Utskrift -1, betyder att värdet inte hittades eftersom 1.4142135623 inte matchar det exakta värdet.\n");


        constants.remove(constants.size()-2);
        System.out.println("Tar bort index -2 (det näst sista indexet): ");
        System.out.println(constants + "\n");

        System.out.println("Finns talet som motsvarar Math.E i listan?");
        System.out.println(constants.contains(Math.E));
        System.out.println("Om exakt matchning hittas: true.\n" + "Om det inte finns en exakt matchning: false \n");

        ArrayList<Double> constantsClone = (ArrayList<Double>) constants.clone();
        System.out.println("Skriver ut en klonad lista: ");
        System.out.println(constantsClone +"\n");

        constantsClone.remove(0);
        System.out.println("Tar bort index 0 i klonad lista: \n" + constantsClone +"\n");

        System.out.println("Skriver ut den icke klonade listan: ");
        System.out.println(constants + "\n");

        constants.remove(0);
        System.out.println("Tar bort index 0 i icke klonad lista: \n" + constants +"\n");

        System.out.println("Om lista och klonad lista är lika, skriv ut 'Lika'.");
        if (constants.equals(constantsClone)) System.out.println("Lika \n");

        constantsClone.clear(); //Rensar klonad lista
        System.out.println("Skriver ut rensad klonad lista: " + constantsClone + "\n");

        System.out.println("Om listorna är olika, skriv 'Olika': ");
        if (!constants.equals(constantsClone)) System.out.println("Olika \n");

        System.out.println("Om clonad lista är tom, skriv 'Tom': ");
        if (constantsClone.isEmpty()) System.out.println("Tom \n");

        System.out.println("Skriver ut den icke klonade listan: ");
        System.out.println(constants + "\n");

        System.out.println("Skriver ut sista indexet: ");
        System.out.println(constants.get(constants.size()-1) +"\n");
        //hämtar det sista indexet i listan.
        //size() ger antalet element i listan, och genom att subtrahera 1 får vi det sista indexet.

        System.out.println("Skriver ut första indexet: ");
        System.out.println(constants.get(0) +"\n");

        constants.remove(2.3025850929);
        System.out.println("Ta bort 2.3025850929: ");
        System.out.println(constants +"\n");

        System.out.println("Byt ut index 1 till Math.PI.");
        constants.set(1,Math.PI);
        System.out.println(constants +"\n");

        System.out.println("Skriv ut klassens namn: ");
        System.out.println(constants.getClass());
    }

    private static Double roundToTenDecimals(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(10, RoundingMode.HALF_UP);
        // Använd setScale för att ställa in antalet decimaler till 10.
        // RoundingMode.HALF_UP innebär att om den 11:e decimalen är 5 eller större, avrundas uppåt.
        return bd.doubleValue();
    }

}