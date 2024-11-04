package Övningar.KlasserObjekt;

public class MyCar

{
    public static void main(String[] args)

    {
        Car Volvo = new Car();
        Car Saab = new Car();
        //Deklarerar variablerna Volvo och Saab av typen Car.
        //skapar ett nytt objekt/instans av klassen Car.
        // När vi använder new Car(),anropar vi konstruktorn för klassen Car

        Volvo.setColor("Red");
        Saab.setColor("Blue");
        //Objekten anropar metoden setColor och sätter färgen “____”.

        String mycolor = Volvo.getColor();
        String yourcolor = Saab.getColor();
        //Här anropar objekten metoden getColor för att hämta färgen och lagrar resultatet i variabeln color.

        System.out.println(mycolor);
        System.out.println(yourcolor); //Skriv ut värdet av variabeln color.
    }
}
