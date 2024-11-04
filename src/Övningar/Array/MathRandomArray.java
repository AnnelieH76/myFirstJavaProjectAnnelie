package Övningar.Array;

public class MathRandomArray {
    public static void main(String[] args) {

        //Uppgift: Generera och spara 10 slumptal ifrån 1-100 i en array
        int[] randomArray = new int[10]; //deklarerar arrayen med 10 index.
        //define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand; //spara i arrayen
        }
        //Skriv ut innehållet i arrayn till consolen
        for (int i = 0; i < 10; i++) {
            System.out.println(randomArray[i]);
        }
        System.out.println();





        //Skapa en metod i en annan klass som du kallar RandomGenerator som returnerar 10 slumptal från 1-100 i en array
        //Skapa ett objekt som anropar metoden randomArray i klassen RandomGenerator
        RandomGenerator generator = new RandomGenerator();
        int[] newArray = generator.randomArray();
        for (int i = 0; i < 10; i++) { //Skriv ut arrayen
            System.out.println(newArray[i]);
        }
        System.out.println();





        //Skapa en metod i klassen RandomGenerator som returnerar slumptal från 1-100 i en array.
        // Arrayen ska också vara ett sluptal mellan 1-100.
        //Skapa ett objekt som anropar metoden randomAmount i klassen RandomGenerator
        RandomGenerator generator2 = new RandomGenerator();
        int[] newAmount = generator2.randomAmount();
        for (int i = 0; i < newAmount.length; i++) { //Skriv ut arrayen
            System.out.println(newAmount[i]);
        }

    }

}


