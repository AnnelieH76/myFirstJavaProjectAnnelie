package Övningar.Array;

public class RandomGenerator {

    //public int length;

    //Metod som returnerar slumptal  mfrån 1-100 i en array
    public int[] randomArray() {

        int[] randomArray = new int[10]; //deklarerar arrayen med 10 index.
        //define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        //generate random numbers from min to max
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand; //spara i arrayen
        }
        return randomArray;
    }





    //Metod som returnerar slumptal från 1-100 i en array. Storleken på arrayen är också ett slumptal från 1-100.
    public int[] randomAmount() {

        //define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        int arrayLength = (int) (Math.random() * range) + min;
        int[] randomAmount = new int[arrayLength];
        //generate random numbers from min to max
        for (int i = 0; i <randomAmount.length ; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomAmount[i] = rand; //spara i arrayen
        }
        return randomAmount;
    }
}



