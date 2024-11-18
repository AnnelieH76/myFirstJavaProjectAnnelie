package Övningar.TestDrivenDevelopment;

public class Test2Calculator
{
   private int first, second;

    public Test2Calculator(int first, int second) //Konstruktorn tar två heltal som parametrar
    {
        this.first = first; //och tilldelar dem till instansvariablerna first och second.
        this.second = second;
    }

    public int add()//Metod
    {
        return first + second;
    }
}
