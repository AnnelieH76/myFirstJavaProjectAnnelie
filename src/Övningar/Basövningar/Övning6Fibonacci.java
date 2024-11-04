package Övningar.Basövningar;

public class Övning6Fibonacci
{
    public static void main(String[] args)
    {
        int first = 1;
        int second = 1;
        {
            System.out.println(first);
        }


        while (second <= 100)
        {
            System.out.println(second);
            int third = first + second;
            first = second;
            second = third;

        }
    }

}
