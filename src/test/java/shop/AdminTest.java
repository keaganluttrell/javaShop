package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AdminTest {
    @Test
    public void createANewAdmin() {
        Admin admin1 = new Admin("001", "pwd", "active", "boss", "boss@email.com");
        assertNotNull(admin1);
    }
    /**
     * test getters and setters for admin class
     */
    @Test
    public void testGetters() {
        Admin admin1 = new Admin("001", "pwd", "active", "boss", "boss@email.com");

        String admin = admin1.getAdminName();
        String email = admin1.getEmail();

        assertEquals("boss", admin, "should have admin name");
        assertEquals("boss@email.com", email, "should have email");
    }
    @Test
    public void testSetters() {
        Admin admin1 = new Admin("001", "pwd", "active", "boss", "boss@email.com");
        String newAdminName = "newAdmin";
        String newEmail = "new@email.com";

        admin1.setAdminName(newAdminName);
        admin1.setEmail(newEmail);

        assertEquals(admin1.getAdminName(), newAdminName);
        assertNotNull(admin1.getEmail(), newEmail);
    }
}
