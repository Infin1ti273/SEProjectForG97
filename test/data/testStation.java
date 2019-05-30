package data;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Class for testing Station's function
 */
class testStation extends AppData {
    /**
     * Test create a station and get its information
     */
    @Test
    void testCreateStation() {
        Station station = new Station("D",8);
        assertEquals("D", station.getName());
        assertEquals(8, station.getSlotSize());
    }

    /**
     * Test if system could read the information of scooter
     */
    @Test
    void testGetScooter() {
        int slotNumber = 7;
        for (Station station : stations) {
            if (station.getName().equals("A")) {
                if (station.getSlot()[slotNumber] == null)
                    System.out.println("the slot " + slotNumber + "do not have scooter");
                else
                    System.out.println("the slot " + slotNumber + "have a scooter");
            }
        }
    }
}
