package Övningar.Test;

public class RectangleMain
{
    public static void main(String[] args)
    {
        int inputhöjd = 10, inputbredd = 10;

        Rectangle rec = new Rectangle(inputhöjd,inputbredd);
        {
            System.out.println("Rektangelns area blir: " + rec.area());
            System.out.println("Omkretsen blir: " + rec.omkrets());

            if(rec.omkvadrat())
                {
                    System.out.println("Detta är en kvadrat!");
                }
            else
                {
                    System.out.println("Detta är en rektangel!");
                }
        }
    }
}


