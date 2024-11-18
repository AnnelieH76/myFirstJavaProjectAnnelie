package Övningar.TestDrivenDevelopment;

public class Rectangle {
    //Attribut
    private int höjd, bredd;

    //Konstruktor
    public Rectangle(int inputhöjd, int inputbredd)
    {
         höjd = inputhöjd;
         bredd = inputbredd;
    }

    //Metoder
    public int area()
    {
        return höjd*bredd;
    }

    public int omkrets()
    {
        return höjd*2 + bredd*2;
    }

    public boolean omkvadrat()
   {
        if (höjd == bredd)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
