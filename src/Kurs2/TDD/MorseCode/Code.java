package Kurs2.TDD.MorseCode;

import java.util.HashMap;
import java.util.Map;

public class Code {
    private static final Map<Character, String> morseCodeMap = new HashMap<>();

    static {
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
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
    }

    public static String get(String text) {
        if (text == null) {
            return "Input cannot be null.";
        }

        StringBuilder morse = new StringBuilder();
        text = text.toUpperCase(); // Convert input to uppercase

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morse.append("/"); // Word separator
            } else if (morseCodeMap.containsKey(c)) {
                if (morse.length() > 0) {
                    morse.append(" "); // Add space between letters
                }
                morse.append(morseCodeMap.get(c));
            } else {
                return "Please write characters A-Z"; // Return error for invalid input
            }
        }
        return morse.toString(); // Return full Morse code string
    }
}

