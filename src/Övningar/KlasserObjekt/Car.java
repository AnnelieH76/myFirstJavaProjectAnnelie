package Övningar.KlasserObjekt;

public class Car

{

    private String Färg = ""; //Deklaration av privat variabel myColor av typen String.
    // Variabeln Färg lagrar bilens färg och kan endast kan nås inom klassen Car.


    public void setColor(String color)//Offentliga metoden setColor kan sätta värdet på Färg.
    {
        Färg = color; // Metoden tar parametern color och tilldelar den till Färg.
    }


    public String getColor() //Offentliga metoden getColor av typen String
    {
        return Färg; //Returnerar värdet på Färg.
    }
}
