package Kurs2.TDD.OOPExtends;

public class AnimalSuperclass {
    protected String name;
    protected String behavior = "Sleep";
    protected int age;

    AnimalSuperclass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void behavior(){
        System.out.println(behavior);
    }

    public void setBehavior(String newBehavior){
        this.behavior = newBehavior;
    }

    public double distance (int numberOfJumps, double distancePerJump ){
        return numberOfJumps * distancePerJump;
    }

}
