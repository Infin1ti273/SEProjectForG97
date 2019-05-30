package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for testing Scooter's function
 */
class testScooter {
    /**
     * Test create a scooter and get its information
     */
    @Test
    void testCreateScooter() {
        Scooter scooter = new Scooter(12);
        assertEquals(12, scooter.getId());
        assertEquals(0, scooter.getUsed());
    }

}