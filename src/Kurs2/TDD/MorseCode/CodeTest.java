package Kurs2.TDD.MorseCode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeTest {

    @Test
    void testGetM() {
        String expected = "--";
        String actual = Code.getMorseCode("M");
        assertEquals(expected, actual);
    }

    @Test
    void testGetABC() {
        //Code code = new Code(ABC);
        String expected = ".- -... -.-.";
        String actual = Code.getMorseCode("ABC");
        assertEquals(expected, actual);
    }

    @Test
    void THANK_YOU() {
        String expected = "- .... .- -. -.-/ -.-- --- ..-";
        String actual = Code.getMorseCode("THANK YOU");
        assertEquals(expected, actual);
    }

    @Test
    void testNumbers() {
        //Code code = new Code(123);
        String expected = "Please write characters A-Z";
        String actual = Code.getMorseCode("123");
        assertEquals(expected, actual);
    }

    @Test
    void testNull() {
        //Code code = new Code();
        String expected = "Input cannot be null.";
        String actual = Code.getMorseCode(null);
        assertEquals(expected, actual);
    }
}