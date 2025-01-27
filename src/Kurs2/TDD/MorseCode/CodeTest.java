package Kurs2.TDD.MorseCode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeTest {


    @Test
    void M() {
        Code code = new Code();
        String expected = "--";
        String actual = code.getMorseCode('M');  // Metoden heter???
        assertEquals(expected, actual);
    }

/*
    @Test
    void A B C() {
        Code code = new Code(A B C);
        String expected = ".- -... -.-.";
        String actual = (char) hashCode(ABC);
        assertEquals(expected, actual);
    }

    @Test
    void THANKYOU() {
        Code code = new Code(THANK YOU);
        String expected = "- .... .- -. -.- -.-- --- ..-";
        String actual = code.     ();
        assertEquals(expected, actual);
    }

    @Test
    void 123() {
        Code code = new Code(123);
        String expected = "Please write characters A-Z";
        String actual = code.     ();
        assertEquals(expected, actual);
    }

    @Test
    void @() {
        Code code = new Code(@);
        String expected = "Please write characters A-Z";
        String actual = code.     ();
        assertEquals(expected, actual);
    }

 */
}


