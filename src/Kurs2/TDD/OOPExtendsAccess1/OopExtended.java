package Kurs2.TDD.OOPExtendsAccess1;

public class OopExtended extends Huvudklassen{ // Subklass inom samma package

    public static void main(String[] args) {

        Huvudklassen sub = new Huvudklassen();
        System.out.println(sub.aPublic); //0
        System.out.println(sub.getaPrivate()); //1 Anropar getter-metoden getaPrivate()
        System.out.println(sub.aNothing); //2
        System.out.println(sub.aProtected); //3

        System.out.println(Huvudklassen.aStaticNothing); //4
        System.out.println(Huvudklassen.aStaticProtected); //5
        System.out.println(Huvudklassen.getaStaticPrivate()); //6 Anropar getter-metoden getaStaticPrivate()
        System.out.println(Huvudklassen.aStaticPublic); //7
    }
}
