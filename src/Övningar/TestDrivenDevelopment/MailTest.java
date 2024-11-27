package Övningar.TestDrivenDevelopment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*


public class MailTest {

    @Test
    public void testAddValidEmail() {
        Mail mail = new Mail();
        boolean email = mail.containsAt("test@example.com");
        assertEquals(true, email );
    }

    @Test
    public void testRejectInvalidEmail() {
        Mail mail = new Mail();
        boolean result = mail.addEmail("invalid-email");  // Testar en ogiltig e-post
        assertEquals(false, result);  // Kontrollera att resultatet är false
        assertEquals(0, mail.getEmailCount());  // Kontrollera att ingen e-post har lagts till
    }

    @Test
    public void testReplaceFirstEmailWhenFull() {
        Mail mail = new Mail();
        mail.addEmail("email1@example.com");
        mail.addEmail("email2@example.com");
        mail.addEmail("email3@example.com");
        mail.addEmail("email4@example.com");

        // Nu är listan full, den första e-posten ska ersättas
        boolean result = mail.addEmail("email5@example.com");

        assertEquals(true, result);  // Kontrollera att resultatet är true
        assertEquals(4, mail.getEmailCount());  // Kontrollera att vi har 4 e-postadresser
        // Kontrollera att den första e-posten har ersatts korrekt
        assertEquals("email2@example.com", mail.getEmails()[0]);
        assertEquals("email3@example.com", mail.getEmails()[1]);
        assertEquals("email4@example.com", mail.getEmails()[2]);
        assertEquals("email5@example.com", mail.getEmails()[3]);
    }
}

 */