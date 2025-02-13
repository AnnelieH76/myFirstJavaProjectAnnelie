package Kurs2.TDD.HashMap;
/*
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameAgeTest {

    @Test
    public void testAddPersonAndGetAge() {
        // Skapa ett NameAge-objekt
        NameAge nameAge = new NameAge();

        // Lägg till en person med namn och ålder
        nameAge.addPerson("Pelle", 23);

        // Kontrollera att åldern är korrekt
        int actualAge = nameAge.getAge("Pelle");
        assertEquals(23, actualAge);
    }

    @Test
    public void testGetAgeForUnknownPerson() {
        // Skapa ett NameAge-objekt
        NameAge nameAge = new NameAge();

        // Kontrollera att åldern för en okänd person returnerar -1
        int actualAge = nameAge.getAge("Unknown");
        assertEquals(-1, actualAge);
    }
}

/*Skapa en ny klass som innehåller en metod med en HashMap för att lagra namn och ålder.
Lägg till några namn och deras motsvarande ålder.
Metoden ska returnera en ålder beroende på vilket namn man har som inparameter.
Skapa metoden med TDD */