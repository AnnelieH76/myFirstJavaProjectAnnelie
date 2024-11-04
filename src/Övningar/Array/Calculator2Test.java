package Övningar.Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test {
    char[] operators = {'+', '-', '*', '/'};


    @Test
    public void add() {
        char[] operators = {'+', '-', '*', '/'};
        int[] terms = {12, 56};
        Calculator2 calculator2 = new Calculator2(terms);
        assertEquals(68, Integer.parseInt(calculator2.operator(operators[0])));
    }

    @Test
    public void sub() {
        char[] operators = {'+', '-', '*', '/'};
        int[] terms = {60, 10};
        Calculator2 calculator2 = new Calculator2(terms);
        assertEquals(50, Integer.parseInt(calculator2.operator(operators[1])));
    }

    @Test
    public void notValidOperator() {
        int[] terms = {70, 10};
        Calculator2 calculator2 = new Calculator2(terms);
        assertEquals("Ogiltigt räknesätt", calculator2.operator('%'));
    }

}

/*
Uppgift:
Skapa en enkel kalkylator som använder en array för att lagra de fyra räknesätten (+, -, *, /).
Användaren ska kunna ange två tal och ett räknesätt,
och programmet ska utföra beräkningen och skriva ut resultatet.
Intalen till logikklassen kan vara en array


Använd int i stället för string!
(Ändra även till int i Calculator2 och Calculator2Main)

 @Test
    public void add() {
        int[] terms = {12, 56};
        Calculator2 calculator2 = new Calculator2(terms);
        assertEquals(68, calculator2.operator(operators[0]));
    }

    @Test
    public void sub() {
        int[] terms = {60, 10};
        Calculator2 calculator2 = new Calculator2(terms);
        assertEquals(50, calculator2.operator(operators[1]));
    }
}
*/