package Kurs2.TDD.MorseCode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeTest {

    @Test
    void testGetM() {
        String expected = "--";
        String actual = Code.get("M");
        assertEquals(expected, actual);
    }

    @Test
    void testGetABC() {
        //Code code = new Code(ABC);
        String expected = ".- -... -.-.";
        String actual = Code.get("ABC");
        assertEquals(expected, actual);
    }

    @Test
    void THANKYOU() {
        String expected = "- .... .- -. -.-/ -.-- --- ..-";
        String actual = Code.get("THANK YOU");
        assertEquals(expected, actual);
    }

    @Test
    void testNumbers() {
        //Code code = new Code(123);
        String expected = "Please write characters A-Z";
        String actual = Code.get("123");
        assertEquals(expected, actual);
    }

    @Test
    void testNull() {
        //Code code = new Code();
        String expected = "Input cannot be null.";
        String actual = Code.get(null);
        assertEquals(expected, actual);
    }
}