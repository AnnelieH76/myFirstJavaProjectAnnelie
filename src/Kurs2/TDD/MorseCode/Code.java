package Kurs2.TDD.MorseCode;

import java.util.HashMap;
import java.util.Map;

public class Code {

    // Skapa en HashMap för morsekod
    Map<Character, String> morseCodeMap = new HashMap<>();

    public Code() {
        morseCodeMap.put('M', "--");

        public String getMorseCode ( char letter){
            return morseCodeMap.get(letter, " ");
        }

    }
}

 /*
        // Skapa en HashMap för morsekod
        Map<Character, String> morseCodeMap = new HashMap<>();

        // Lägg till bokstäverna A-Z och deras motsvarande morsekod
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W' , ".--");
        morseCodeMap.put('X' , "-..-");
        morseCodeMap.put('Y' , "-.--");
        morseCodeMap.put('Z' , "--..");
}

 */