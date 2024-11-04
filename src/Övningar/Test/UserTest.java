package Övningar.Test;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    void getUsername(){
        User user = new User("Lisa", "abc123");
        assertEquals("Lisa", user.getUsername() );
    }

    @Test
    void getPassword() {
        User user = new User("tomas", "abc123");
        assertEquals("abc123", user.getPassword());
    }

    @Test
    void setUsernameLessThan4Char(){
        User user = new User("tomas", "abc123");
        user.setUsername("Bo");
        assertEquals("tomas", user.getUsername());
    }

    @Test
    void setUsernameMoreThan4Char(){
        User user = new User("tomas", "abc123");
        assertEquals("tomas", user.getUsername() );
    }



}

