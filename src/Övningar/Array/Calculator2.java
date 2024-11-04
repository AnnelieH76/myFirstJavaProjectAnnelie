package Övningar.Array;
//GitHub test
public class Calculator2 {

    char[] operators = {'+', '-', '*', '/'}; //Deklarerar en array som innehåller 4 räknesätt.
    int[] inputArray; //Deklarerar arrayen som kommer lagra de två inmatade värdena.

    //Konstruktor
    public Calculator2(int[] inputArray) {
        this.inputArray =inputArray;
    } //Klassens konstruktor skapas och en array deklareras som startvärde.
    //Arrayen tilldelas värdet av arrayen med de två inmatade talen.


    //Metoden 'operator' skapas och tilldelas teckenvariabeln operator. Metoden returnerar en String.
    public String operator(char operator) {

        boolean validOperator = false;
        //En boolean skapas och variabeln validOperator tilldelas värdet false.

        for (char op : operators) {
            //For each-loop skapas, teckenvariabeln op deklareras och går igenom tecknen i arrayen operators.
            if (operator == op) { // Om 'operator' som användaren skickar in = något tecken i op
                validOperator = true; // sätts validOperator till true
                break; // då bryts loopen
            }
        }
        if (!validOperator) { // Om inte validOperator är true
            return "Ogiltigt räknesätt"; //returnera texten "Ogiltigt räknesätt"
        }

        //If-else-strukturen väljer rätt räknesätt
        // returnerar en konvertering av heltal till sträng
        // beräkning görs av inläst tal med index 0 och index 1.
        if (operator == '+') return Integer.toString(inputArray[0]+inputArray[1]);
        else if (operator == '-') return Integer.toString(inputArray[0]-inputArray[1]);
        else if (operator == '*') return Integer.toString(inputArray[0]*inputArray[1]);
        else if (operator == '/') return Integer.toString(inputArray[0]/inputArray[1]);
        else return "Ogiltigt val";

    }
}

/*
Använd till int i stället för string!
(Ändra även till int i Calculator2Test och Calculator2Main)

//Metoden operator skapas....
public int operator(char operator) {
    boolean validOperator = false;

    for (char op : operators) {
        if (operator == op) {
            validOperator = true;
            break;
        }
    }

    if (!validOperator) {
        throw new IllegalArgumentException("Ogiltigt räknesätt");
    }

    if (operator == '+') return inputArray[0] + inputArray[1];
    else if (operator == '-') return inputArray[0] - inputArray[1];
    else if (operator == '*') return inputArray[0] * inputArray[1];
    else if (operator == '/') return inputArray[0] / inputArray[1];
    else throw new IllegalArgumentException("Ogiltigt val");
}
 */
