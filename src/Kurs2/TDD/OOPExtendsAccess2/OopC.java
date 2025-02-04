package Kurs2.TDD.OOPExtendsAccess2;

import Kurs2.TDD.OOPExtendsAccess1.Huvudklassen; //Subklass i annat package

public class OopC {
    public static void main(String[] args) {
        Huvudklassen oopA = new Huvudklassen();

        System.out.println(oopA.aPublic); //0
        System.out.println(oopA.getaPrivate()); //1 Anropar getter-metoden getaPrivate()
        //System.out.println(oopA.aNothing); //2
        //System.out.println(oopA.aProtected); //3

        //System.out.println(Huvudklassen.aStaticNothing); //4
        //System.out.println(Huvudklassen.aStaticProtected); //5
        System.out.println(Huvudklassen.getaStaticPrivate()); //6 Anropar getter-metoden getaStaticPrivate()
        System.out.println(Huvudklassen.aStaticPublic); //7
    }
}
