package Övningar.KlasserObjekt;

public class Pet
    {
        //Instansvariabler som tillhör ett specifikt objekt av klassen.
        private String name;
        private String type;


        //Konstruktor
        //En speciell metod som anropas när ett nytt objekt av klassen skapas.
        // Här tar konstruktorn ett namn som parameter och tilldelar det till instansvariabeln name.
        public Pet(String petName, String petType)
        {
            name=petName;
            type=petType;
        }


        //Metod för att skriva ut namn
        /*public void printTypeAndName()
        {
            System.out.println(type + "ens namn är " + name);
        }

         */


        //Metod för att hämta värdet i variabeln namn
        public String getName()
        {
            return name;
        }
        public String getType()
        {
            return type;
        }
    }
