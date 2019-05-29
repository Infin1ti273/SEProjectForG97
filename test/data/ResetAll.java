package data;

import org.junit.jupiter.api.Test;

import java.util.Vector;

class ResetAll extends AppData {
    /**
     * reset transaction, station, scooter and user information
     */
    @Test
    void resetAll() {
        testResetTransaction();
        testResetStationAndScooter();
        testResetUserData();
    }

    /**
     * Reset transaction to init state (says nothing)
     */
    @Test
    void testResetTransaction() {
        transactions = new Vector<>();
        updateData();
    }

    /**
     * Initialize Station information
     * (Every station has 5 scooters, which occupy the first 5 slots)
     */
    @Test
    void testResetStationAndScooter() {
        int i = 1;
        stations = new Vector<>();
        scooters = new Vector<>();
        updateData();

        Station station1 = new Station("A", 8);
        Station station2 = new Station("B", 8);
        Station station3 = new Station("C", 8);
        for(;i<=5;i++) {
            Scooter scooter = new Scooter(i);
            station1.addScooter(scooter);
            scooters.add(scooter);
        }
        for(;i<=10;i++) {
            Scooter scooter = new Scooter(i);
            station2.addScooter(scooter);
            scooters.add(scooter);
        }
        for(;i<=15;i++) {
            Scooter scooter = new Scooter(i);
            station3.addScooter(scooter);
            scooters.add(scooter);
        }
        stations.add(station1);
        stations.add(station2);
        stations.add(station3);
        updateData();
    }

    /**
     * Reset user information, Only be used when need to import data again
     * Need to reset station information simultaneously
     */
    @Test
    void testResetUserData() {
        users = new Vector<>();
        users.add(new User(123456789,"first","aaa@qmul.ac.uk"));
        users.add(new User(111111111,"second","bbb@qmul.ac.uk"));
        users.add(new User(222222222,"third","ccc@qmul.ac.uk"));
        users.add(new User(333333333,"second","ddd@qmul.ac.uk"));
        users.add(new User(161188623,"Weipeng Shen","jp2016213556@qmul.ac.uk"));
        updateData();

    }
}
