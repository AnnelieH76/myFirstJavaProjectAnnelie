package Övningar.Array;

public class Names {
    public static void main(String[] args) {

        //När du vet vilka namn du vill lägga in i arrayn
        String[] firstname = {"Pelle", "Annelie", "Kalle", "Lisa", "Sara"};

        //Skriv ut första och sista namnet
        System.out.println(firstname[0]);
        System.out.println(firstname[4]);

        //Skriv ut alla förnamn när du vet att arrayn har 5 index
        for(int i = 0; i<5; i++){
            System.out.println(firstname[i]);
        }


        //När du vill lägga in namn efter hand
        String[] lastname = new String[5];
        lastname[0] = "Andersson";
        lastname[1] = "Bengtsson";
        lastname[2] = "Carlsson";
        lastname[3] = "Davidsson";
        lastname[4] = "Hagen";


        //Skriv ut alla efternamn med lastname.length när du inte vet hur lång arrayen är.
        for(int i = 0; i<lastname.length; i++){
            System.out.println(lastname[i]);
        }


        //Splitta textrad till array med ord
        String myString = "Hej på dig ";
        String[] stringArray =myString.split(" ");
        for(int i = 0; i<3; i++){
            System.out.println(stringArray[i]);
        }

        //Skriv ut "Hej på dig Annelie Hagen! Vad snygg du är idag."
        System.out.println(myString +(firstname [1]) + " " + (lastname[4]) +"! Vad snygg du är idag.");

    }
}