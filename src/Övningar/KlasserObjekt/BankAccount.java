package Övningar.KlasserObjekt;

public class BankAccount
{
    int saldo;

    public void setSaldo(int newSaldo)
    {
        this.saldo = newSaldo;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void withdraw(int amount)
    {
        this.saldo=saldo-amount;
    }

    public void deposit(int amount)
    {
        this.saldo= saldo+amount;
    }
}


//Skapa ett program BankAccount som kan hålla koll på hur stort saldo man har (pengar på sitt konto)
//Utöka programmet så att man kan skriva ut saldot
//Utöka programmet så att man kan bestämma 	ett nytt värde för saldo
//Utöka programmet så att man kan lägga till och ta bort en viss summa ifrån saldot
//Utöka programmet så att man aldrig kan få ett saldo som är mindre än 0 kronor

//I BankAccount gör static attribut på Banknamnet och ränta. Och om ni vill räkna ut räntan på kontot vid årets slut.