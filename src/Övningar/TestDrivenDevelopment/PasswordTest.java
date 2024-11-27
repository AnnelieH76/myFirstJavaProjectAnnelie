package Övningar.TestDrivenDevelopment;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordTest {

    @Test
    public void testHasNoSpecials()
    {
        //Arrange
        Password pass = new Password();
        boolean expected = false;

        //Act
        boolean actual = pass.check("NoSpecials1");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testValidPassword()
    {
        //Arrange: Skapar en instans/nytt objekt
        Password pass = new Password();
        boolean expected = true;

        //Act: Anropar metoden på objektet och sparar resultatet i actual.
        boolean actual = pass.check("password1#");

        //Assert: Jämför förväntat resultat (expected) och faktiskt resultat (actual) med assertEquals.
        assertEquals(expected, actual);
    }

    @Test
    public void testNotEnoughCharacters()
    {
        //Arrange
        Password pass = new Password();
        boolean expected = false;
        //Act
        boolean actual = pass.check("word1#");
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoDigits()
    {
        //Arrange
        Password pass = new Password();
        boolean expected = false;

        //Act
        boolean actual = pass.check("NoDigits#");

        //Assert
        assertEquals(expected, actual);
    }
}

/*
Skriv in ett lösenord
Lösenordet måste ha minst 8 tecken
Minst 1 siffra
Minst 1 specialtecken
 */