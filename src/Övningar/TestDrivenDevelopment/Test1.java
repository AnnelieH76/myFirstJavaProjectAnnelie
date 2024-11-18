package Övningar.TestDrivenDevelopment;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Test1
{
    @Test
    public void firstTestCase() //metod
    {
        String text = "some text";
        int actual =text.length();//variabeln actual används i en metod, resultatet sparas i actual
        int expected = 9; //Förväntat värde sparas i variabeln expected
        assertEquals(expected, actual);//Jämför
    }
}
