package Övningar.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest
{
    @Test
    void area1()
    {
        Circle circle = new Circle(5);  // Skapa ett Circle-objekt
        double expected = 5 * 5 * 3.14;
        double actual = circle.calculateArea();  // Metoden heter calculateArea
        assertEquals(expected, actual, 0.01);  // Lägg till en tolerans på 0.01
    }

    @Test
    void circumference()
    {
        Circle circle = new Circle(5);
        double expected = 5 * 2 * 3.14;
        double actual = circle.calculateCircumference();
        assertEquals(expected, actual, 0.01);  // Lägg till en tolerans på 0.01
    }

    @Test
    void area2()
    {
        Circle circle =new Circle(8);//Skapa objekt
        double expected = 8*8*3.14;
        double actual = circle.calculateArea();
        assertEquals(expected, actual);
    }

}
