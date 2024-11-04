package Övningar.Test;

public class Circle
{
    //Attribut
    private double radie;


    //Konstruktor
    public Circle(double radie)
    {
        this.radie = radie;
    }

    //Metoder
    public double calculateArea()
    {
        return radie*radie*3.14;
    }

    public double calculateCircumference()
    {
        return radie*2*3.14;
    }

    public boolean isBiggerThan(Circle Circle2)
    {
        return this.calculateArea() >Circle2.calculateArea();
    }



}
