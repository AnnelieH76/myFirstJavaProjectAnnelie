package Övningar.Test;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordTest
{
    @Test
    public void TestSendingText() //Skapa metod som heter TestSendingText
    {
        //Arrange: Skapar en instans/nytt objekt
        Password pass = new Password();
        boolean expected = true;

        //Act: Anropa metoden på objektet och sparar resultatet i actual.
        boolean actual = pass.check("password");

        //Assert: Jämför förväntat resultat (expected) och faktiskt resultat (actual) med assertEquals.
        assertEquals(expected, actual);

    }
}



