package Kurs2.TDD.OopVehicle;

public class BicycleSubClass extends VehicleSuperClass{

    private int gears = 0;

    public void nbrOfGears(int nbr){
        if(nbr < 1){
            System.out.println("Antal växlar måste vara minst 1");
        }
        else if( nbr >21) {
            System.out.println("Antal växlar får vara max 21");
        }
        else{
            this.gears = nbr;
        }
    }

    public void increaseSpeed(double force){
        if (gears > 0) {
            this.speed += force;
        } else {
            System.out.println("Hastigheten kan därför inte ökas.");
        }
    }
}
