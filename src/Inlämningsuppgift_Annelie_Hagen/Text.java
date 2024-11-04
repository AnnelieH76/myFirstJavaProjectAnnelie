package Inlämningsuppgift_Annelie_Hagen;

import java.util.ArrayList;

public class Text {


    private ArrayList<String> inputLines;

    //Konstruktor
    public Text (){
        this.inputLines = new ArrayList<>();
    }


    public boolean isStop(String input) {
        return input.equalsIgnoreCase("stop");
    }

    public void addLine(String input) {
        inputLines.add(input);
    }

    public int getLineCount() {
        return inputLines.size();
    }

    public int getCharCount() {
        int charCount = 0;
        for (String line : inputLines) {
            charCount += line.length();
        }
        return charCount;
    }
}
