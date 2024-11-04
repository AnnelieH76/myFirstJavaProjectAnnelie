package Övningar.Basövningar;

public class Övning13
{
    public static void main(String[] args)
    //Skapa ett program som läser in ett tal och skriver ut om det är jämnt.
    // (Använd modulooperatorn)
    {
        int number = 21;


        if (number % 2 == 0) //Om number delat med 2 får resten 0
        {
            System.out.println("Numret är jämnt!");
        }
        else
        {
            System.out.println("Numret är inte jämnt!");
        }


    }

}
