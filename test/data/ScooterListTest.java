package data;


import org.junit.jupiter.api.Test;

import java.util.Vector;

class ScooterListTest extends AppData {
    /**
     * Test if system could read the information of scooter
     */
    @Test
    void testGetScooter() {
        for (Station station : stations) {
            if (station.getName().equals("A")) {
                if (station.getSlot()[7] == null)
                    System.out.println("no 7");
            }
        }
    }
}
