package Övningar.TestDrivenDevelopment;

public class CircleMain
{
    public static void main(String[] args)
    {
        double inputRadie1= 7; //Mata in radie i centimeter.
        double inputRadie2= 5;

        Circle circle1 =new Circle(inputRadie1);
        Circle circle2 =new Circle(inputRadie2);
        {
            System.out.println("Arean på den första cirkeln är: " + circle1.calculateArea() + " kvadratcentimeter");
            System.out.println("Omkretsen på den första cirkeln är: " + circle1.calculateCircumference() + " cm");
            System.out.println("Arean på den andra cirkeln är: " + circle2.calculateArea() + " kvadratcentimeter");
        }

        if (circle1.isBiggerThan(circle2))
        {
            System.out.println("Cirkel 1 är större än 2");
        }
        else {
            System.out.println("Cirkel 2 är störst");
        }

    }
}
