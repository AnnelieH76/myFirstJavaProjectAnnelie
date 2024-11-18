package Övningar.TestDrivenDevelopment;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class SolidusTest {

    @Test
    public void testSeeSaldo() { //Metod
        Solidus solidus = new Solidus(); //Skapa objekt
        assertEquals(5, solidus.getSolidus());//Jämför
    }

    @Test
    public void testWithdaw() {
        Solidus solidus = new Solidus();//Arrange. Skapa objekt och lägg in värden
        solidus.withdraw(3);//Act: Anropa metoden och spara resultatet i actual.
        assertEquals(2, solidus.getSolidus()); //Assert: Jämför (expected) och (actual) med assertEquals.
    }

    @Test
    public void testBecomeGoldmember() {
        Solidus solidus = new Solidus();
        solidus.becomeGoldmember();
        assertEquals(25, solidus.getSolidus());
    }

    @Test
    public void testSeeMemberSaldo() {
        Solidus solidus = new Solidus();
        solidus.becomeGoldmember();
        assertEquals(25, solidus.getSolidus());
    }

    @Test
    public void testLogIn2Times() {
        Solidus solidus = new Solidus();
        solidus.logIn();
        solidus.logIn();
        assertEquals(7, solidus.getSolidus());
    }

    @Test
    public void testBuyHoodie() {
        Solidus solidus = new Solidus();
        solidus.becomeGoldmember(); //Bli guldmedlem
        solidus.buyHoodie(); //Köp hoddie
        assertEquals(5, solidus.getSolidus());
    }

    @Test
    public void testBuyTshirt() {
        Solidus solidus = new Solidus();
        solidus.becomeGoldmember(); //Bli guldmedlem
        solidus.buyTshirt(); //Köp T-shirt
        assertEquals(10, solidus.getSolidus());
    }

    @Test
    public void testBuySticker() {
        Solidus solidus = new Solidus();
        solidus.buySticker(); //Köp Sticker
        assertEquals(0, solidus.getSolidus());
    }

}

/*
Det finns en intern valuta ”solidus” som man kan göra uttag ifrån.
Man kan såklart enbart göra så stort uttag som man har ”råd med”.
Alla börjar med 5 solidus och när man blir gold member får man 20 solidus automatiskt.
Användarna vill såklart kunna ta reda på hur många solidus de har.
Varje gång man loggar in får man en solidus.
Med solidus kan man köpa merch: hoodie kostar 20 solidus, t-shirt 15 solidus och stickers 5 solidus.
Detta är en massa funktioner, utveckla dem därför med flera steg enligt TDD
*/