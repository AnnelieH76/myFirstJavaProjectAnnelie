package Övningar.KlasserObjekt;

public class SwitchMetod {

    public void catchPhrase(int number) {

        switch (number) {
            case 1:
                System.out.println("Have a great day!");
                break;
            case 2:
                System.out.println("Take care of yourself.");
                break;
            case 3:
                System.out.println("Let’s keep in touch.");
                break;
            case 4:
                System.out.println("I’ll be right back.");
                break;
            case 5:
                System.out.println("Nice to meet you.");
                break;
            case 6:
                System.out.println("What do you think?");
                break;
            case 7:
                System.out.println("Time flies fast.");
                break;
            case 8:
                System.out.println("I really appreciate it.");
                break;
            case 9:
                System.out.println("It’s up to you.");
                break;
            case 10:
                System.out.println("See you soon!");
                break;
            default:
                System.out.println("Felaktigt val");
        }
    }
}

