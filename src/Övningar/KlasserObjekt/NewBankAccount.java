package Övningar.KlasserObjekt;

public class NewBankAccount {

    double saldo;
    static String bankName= "Annelies Bank";
    static double interestRate = 0.05;


    public void setSaldo(int newSaldo) {
        this.saldo = newSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void withdraw(int amount) {
        this.saldo = saldo - amount;
    }

    public void deposit(int amount) {
        this.saldo = saldo + amount;
    }

    public double getInterestRate(){
        return interestRate * 100;
    }

    public void addInterest(){
        this.saldo = saldo + saldo * interestRate;
    }
    public String bankInformation(){
        return bankName;
    }

}

//Skapa ett program BankAccount som kan hålla koll på hur stort saldo man har (pengar på sitt konto)
//Utöka programmet så att man kan skriva ut saldot
//Utöka programmet så att man kan bestämma ett nytt värde för saldo
//Utöka programmet så att man kan lägga till och ta bort en viss summa ifrån saldot
//Utöka programmet så att man aldrig kan få ett saldo som är mindre än 0 kronor

//Utöka och gör static attribut för Banknamnet och ränta. Räkna ut och addera räntan på kontot.
//Gör om till switch istället för if-satser.
