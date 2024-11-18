package Övningar.TestDrivenDevelopment;

public class Solidus {

    private int solidus;
    private int hoddie;
    private int tshirt;
    private int sticker;

    public Solidus() {
        this.solidus = 5;
        this.hoddie = 20;
        this.tshirt = 15;
        this.sticker = 5;
    }

    public int getSolidus() {
        return solidus;
    }

    //Provar att göra men metod av typen boolean
    public boolean withdraw(int withdrawAmount) {
        if (withdrawAmount <= solidus) {
            solidus -= withdrawAmount;
            return true;
        } else return false;
    }

    //Provar att returnera och utföra beräkning på samma kodrad.
    public int becomeGoldmember() {
        return solidus += 20;
    }

    public int logIn() {
        return solidus++;
    }

    //Provar att returnera solidus som innehåller aktuellt saldo
    public int buyHoodie() {
        if (hoddie <= solidus) {
            solidus -= hoddie;
            return solidus;
        }else return solidus;
    }

    public int buyTshirt() {
        if (tshirt <= solidus) {
            solidus -= tshirt;
            return solidus;
        }else return solidus;
    }

    public int buySticker() {
        if (sticker <= solidus) {
            solidus -= sticker;
            return solidus;
        }else return solidus;
    }
}
