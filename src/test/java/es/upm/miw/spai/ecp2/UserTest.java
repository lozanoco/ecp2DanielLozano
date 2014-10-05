package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User usr;

    @Before
    public void before() {
        usr = new User(2,"Juan","Perez");
    }
    
    @Test
    public void testGetName() {
        assertEquals("JUAN", usr.getName());
    }

    @Test
    public void testConstructorIntStringString() {
        assertEquals(2, usr.getNumber());
        assertEquals("Juan", usr.getName());
        assertEquals("Perez", usr.getFamilyName());
    }

    @Test
    public void testFullNameString() {
        assertEquals("Juan Perez", usr.fullName());
    }
    
    @Test
    public void testInitialsString() {
        assertEquals("J.", usr.initials());
    }

}
