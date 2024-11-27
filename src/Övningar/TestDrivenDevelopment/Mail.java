package Övningar.TestDrivenDevelopment;

public class Mail {
    private String[] emails;
    private int emailCount;

    public Mail() {
        this.emails = new String[4];
       // this.emailCount = 0;
    }

    // Metod för att lägga till en e-postadress
    public boolean containsAt(String email) {
        if (!email.contains("@")) {
            System.out.println("Ogiltig e-postadress. En e-postadress måste innehålla '@'.");
            return false;
        }
        return true;
    }

    // Metod för att hämta alla registrerade e-postadresser
    public String[] getEmails() {
        String[] result = new String[emailCount];
        System.arraycopy(emails, 0, result, 0, emailCount);
        return result;
    }

    public int getEmailCount() {
        return emailCount;
    }
}

/*
En User kan lägga till en e-mail
En User kan ha upp till 4 e-mail lagrade i en String-Array (String[]).
En e-mail måste innehålla tecknet @.
Om fler än 4 e-mail läggs till så ersätts den första e-postadressen med den man försöker lägga till.​


Det går även att kolla upp vilken e-mail en användare har registrerad.​
En User kan inte lägga till en email som redan finns registrerad
En User kan ta bort en email
En User kan fråga hur många email de har lagrade
 */