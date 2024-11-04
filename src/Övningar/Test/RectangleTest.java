package Övningar.Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest
{
    @Test
    public void area()//Skapar en metod
    {
        //Arrange. Skapa objekt och lägg in värden
        Rectangle calc = new Rectangle(10, 20); //skickar in värdena till konstruktorn
        int expected = 200;

        //Act: Anropa area-metoden på Rectangle-objektet och sparar resultatet i actual.
        int actual = calc.area();

        //Assert: Jämför förväntat resultat (expected) och faktiskt resultat (actual) med assertEquals.
        Assert.assertEquals(expected, actual);
    }

    @Test
    void omkrets()
    {
        Rectangle rectangle = new Rectangle(5,10);
        assertEquals(30, rectangle.omkrets());
    }

    @Test
    void omkvadrat()
    {
        Rectangle rectangle = new Rectangle(8,10);
        assertEquals(false, rectangle.omkvadrat());
    }
}

