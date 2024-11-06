package Övningar.KlasserObjekt;

public class RandomInput {

    int n;

    //Konstruktor
    public RandomInput (int n){
        this.n =n;
    }

    //Metod
     public int generateRandomNumber(){
        int min =0;
        int max =n;

        return (int) (Math.random()*(max - min +1)) +min;
     }

}
