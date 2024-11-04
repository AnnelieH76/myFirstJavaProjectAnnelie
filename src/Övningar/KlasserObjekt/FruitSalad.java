package Övningar.KlasserObjekt;

public class FruitSalad {
    public static void main(String[] args) {

        Fruit apple = new Fruit();
        Fruit pear = new Fruit();
        Fruit orange = new Fruit();

        //Anropar metoden printColor
        apple.printColor();
        pear.printColor();
        orange.printColor();
    }
}
