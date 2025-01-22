package Kurs2.TDD.SubClasses;

public class ZooMain {
    public static void main(String[] args) {
        DogSubClass d = new DogSubClass();
        d.bark();
        d.eat();

        CatSubClass c = new CatSubClass();
        c.mew();
        c.eat();
    }
}
