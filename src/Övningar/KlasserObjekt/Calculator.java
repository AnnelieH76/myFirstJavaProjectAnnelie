package Övningar.KlasserObjekt;


public class Calculator {
    //Attribut
    private double a;
    private double b;


    public Calculator(int inputA, int inputB){ //Konstruktor
        this.a = inputA;
        this.b = inputB;
    }

    public double add(){//Metod som är publik, intigern add returnera summan.
        return this.a + this.b;
    }

    public double sub(){ //Publik metod med intiger sub som returnerar differensen
        return a - b;
    }

    public double div() {
        return a / b;
    }

    public double mult() {
        return a * b;
    }

    public int seil(){
        return (int) Math.ceil(a/b);
    }

    public double max(){
        return Math.max(a,b);
    }

    public int floor(){
        return (int) Math.floor(a/b);
    }

}

// 6.Skapa en class Calculator som läser in två tal i konstruktorn och sparar dem som attribut
// 7.Skapa en metod som skriver ut addition för dessa två tal.
// Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en main-metod
// 8.Uppdatera din main-metod så att den läser in de två talen med Scanner
// 9.Uppdatera Calculator så att den har liknande metoder för minus/delat med/gånger

