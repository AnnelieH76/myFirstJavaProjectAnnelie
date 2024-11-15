package Övningar.KlasserObjekt;

import java.util.Scanner;

public class NewBankAccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra? ");
        System.out.println("1 Bestämma mitt saldo");
        System.out.println("2 Se saldo");
        System.out.println("3 Uttag");
        System.out.println("4 Insättning");
        System.out.println("5 Se räntesats");
        System.out.println("6 Lägg till ränta");
        System.out.println("7 Se bankinformation");
        System.out.println("8 Avsluta");

        NewBankAccount myAccount = new NewBankAccount();

        int val;
        do {
            val = scanner.nextInt();
            scanner.nextLine();

            switch (val) {
                case 1:
                System.out.println("Vilket saldo har du? ");
                int saldo = scanner.nextInt();
                myAccount.setSaldo(saldo);
                break;

                case 2:
                System.out.println("Ditt saldo är: " + myAccount.getSaldo());
                break;

                case 3:
                System.out.println("Hur mycket vill du ta ut? ");
                int belopp = scanner.nextInt();

                if (belopp > myAccount.saldo) {
                    System.out.println("Beloppet är för stort");
                } else {
                    myAccount.withdraw(belopp);
                    System.out.println("Ditt saldo är nu: " + myAccount.getSaldo());
                }
                break;

                case 4:
                System.out.println("Hur mycket vill du sätta in? ");
                int depositAmount = scanner.nextInt();
                myAccount.deposit(depositAmount);
                System.out.println("Ditt saldo är nu: " + myAccount.getSaldo());
                break;

                case 5:
                System.out.println("Din ränta är " + myAccount.getInterestRate() + " %" );
                break;

                case 6:
                    myAccount.addInterest();
                System.out.println("Ditt saldo inkl. ränta är " + myAccount.getSaldo() + " kr");
                break;

                case 7:
                System.out.println("Det här är " + myAccount.bankInformation());
                break;

                case 8:
                    break;

                default:
                    System.out.println("Ogiltigt val.");
                break;
            }

        }
        while (val != 8);

        System.out.println("Tack för besöket, välkommen åter!");;
        scanner.close();
    }
}


