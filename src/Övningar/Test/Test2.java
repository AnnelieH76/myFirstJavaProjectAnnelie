package Övningar.Test;

import org.junit.jupiter.api.Test;
//Importerar @Test-annoteringen från JUnit 5,
// som används för att markera en metod som ett test.
import static org.junit.Assert.assertEquals;
//Importerar assertEquals-metoden från JUnit 4,
// som används för att jämföra förväntat och faktiskt resultat.

public class Test2
{
    @Test //Markerar metoden add som ett test.
    public void add()//Skapar en metod
    {
        //Arrange: Skapar en instans/nytt objekt av Test2Calculator
        Test2Calculator calc = new Test2Calculator(1,3); //skickar in värdena 1 och 3 till konstruktorn
        int expected = 4; //Sätter värdet på förväntat resultat till 4

        //Act: Anropa add-metoden på calc-objektet och sparar resultatet i actual.
        int actual = calc.add();

        //Assert: Jämför förväntat resultat (expected) och faktiskt resultat (actual) med assertEquals.
        assertEquals(expected, actual);

    }


}
