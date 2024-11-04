package Övningar.Basövningar;

public class StringLength
{
    public static void main(String[] args)
    {
        String myString = "Min egen text";

        if(myString.length()==13)
        {
            System.out.println("Om min text har 13 tecken så skrivs detta ut!");
        }

        System.out.println("Tecken 8 på index 7 är: " + myString.charAt(7)); //Index börjar på 0
        System.out.println("Hur många tecken har min text? " + myString.length() + " st");
    }
}
