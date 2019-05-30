package data;

import org.junit.jupiter.api.Test;

/**
 * Class for testing User's function
 */
class testUser {

    /**
     * Test create a new user
     */
    @Test
    void testCreateUser() {
        User user = new User(161188896,"Shizun Wang", "jp2016213584@qmul.ac.uk");
        assertEquals(161188896, user.getQmNumber());
        assertEquals("Shizun Wang", user.getFullName());
        assertEquals("jp2016213584@qmul.ac.uk", user.getEmail());
    }
}