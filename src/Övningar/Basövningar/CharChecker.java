package Övningar.Basövningar;

public class CharChecker

{
    public static void main(String[] args)
    {
        char ch = 'å';
        if (Character.isLetter(ch) && (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + " är en engelsk bokstav.");
        } else
        {
            System.out.println(ch + " är inte en engelsk bokstav.");
        }
    }
}
