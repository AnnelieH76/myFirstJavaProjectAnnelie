
import java.util.ArrayList;
import java.util.Scanner;

public class JanneTestarArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> textList = new ArrayList<>();

        System.out.println("Skriv in text rad för rad, avsluta med ordet 'stop':");
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) { // Avslutar om användaren skriver "stop"
                break;
            }
            textList.add(line); // Lägger till raden i ArrayList
        }

        // Skriver ut texten från ArrayList
        System.out.println("\nDu skrev:");
        for (String line : textList) {
            System.out.println(line);
        }

        scanner.close();
    }


}
