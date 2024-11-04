package Övningar.Basövningar;

public class StringEquals
{

    public static void main(String[] args)
    {

        String myString = "Jämför text";

        if(myString.equals ("Jämför text"))
        {
            System.out.println("Metoden equals fungerar alltid!");
        }

        if(myString == ("Jämför text"))
        {
            System.out.println("Tecknen == fungerade också, den här gången.");
        }
        else
        {
            System.out.println("Tecknen == fungerade inte den här gången.");
        }

    }
}
