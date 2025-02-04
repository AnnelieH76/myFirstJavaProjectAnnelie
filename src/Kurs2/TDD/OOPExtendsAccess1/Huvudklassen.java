package Kurs2.TDD.OOPExtendsAccess1;

public class Huvudklassen {

    //Utan static är variabler unika för varje objekt av klassen.
    public int aPublic = 0; // Överallt
    private int aPrivate = 1; // Bara inom denna klass. Nås från andra klasser med getter-metod.
    int aNothing = 2; // (Utan modifier) Inom samma package (men ej i subclass).
    protected int aProtected = 3; // Inom samma package + subklasser (även utanför package)


    //Static betyder att variabeln eller metoden "tillhör klassen" och ärvs inte ett specifikt objekt.
    //En static variabel är delad mellan alla objekt av klassen. Om du ändrar den, ändras den för alla.
    static int aStaticNothing = 4;
    protected static int aStaticProtected = 5;
    private static int aStaticPrivate =6;
    public static int aStaticPublic = 7;


    public int getaPrivate() { //Getter-metod för att nå värdet på privata variabler och metoder från andra klasser.
        return aPrivate;
    }

    public static int getaStaticPrivate() { //Getter-metod för att nå värdet på privata variabler och metoder från andra klasser.
        return aStaticPrivate;
    }

    public static boolean staticPublic; //Huvudklassen är public, kan nås från andra klasser och package i hela projektet.
}



