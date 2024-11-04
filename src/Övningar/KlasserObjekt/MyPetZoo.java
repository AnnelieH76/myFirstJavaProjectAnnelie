package Övningar.KlasserObjekt;

public class MyPetZoo
{
    public static void main(String[] args)
    {
        // Skapar tre Pet-objekt med namn
        Pet dog = new Pet ("Fido", "Hund");
        Pet cat = new Pet ("Missan", "Katt");
        Pet rabbit = new Pet ("Hoppe", "Kanin");

        //dog.printName();
        //cat.printName();
        //rabbit.printName();

        // Hämtar namnen på husdjuren
        String dogName = dog.getName();
        String catName = cat.getName();
        String rabbitName = rabbit.getName();

        //Hämtar typen på husdjuren
        String dogType = dog.getType();
        String catType = cat.getType();
        String rabbitType = rabbit.getType();

        // Skriver ut namn på husdjuren samt typ och namn på husdjuren, två gånger
        for (int i=0; i<2; i++)
        {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);

            System.out.println(dogType + "ens namn är " + dogName);
            System.out.println(catType + "ens namn är " + catName);
            System.out.println(rabbitType + "ens namn är " + rabbitName);
        }


    }

}
