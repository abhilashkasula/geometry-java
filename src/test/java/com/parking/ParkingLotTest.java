package com.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldAddCarToParkingLot() {
        final ParkingLot parkingLot = new ParkingLot(3);

        assertTrue(parkingLot.park());
    }

    @Test
    void shouldNotAddCarWhenParkingLotIsFull() {
        final ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.park();

        assertFalse(parkingLot.park());
    }

    @Test
    void shouldAddObserver() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertTrue(parkingLot.addObserver(new Attendant()));
    }

    @Test
    void shouldNotifyObserversWhenParkingLotIsFull() {
        final ParkingLot parkingLot = new ParkingLot(5);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        parkingLot.addObserver((s) -> assertEquals(ParkingLotStatus.EIGHTY_PERCENT_FULL, s));
        parkingLot.addObserver((s) -> assertEquals(ParkingLotStatus.FULL, s));
    }

    @Test
    void shouldNotifyObserversWhenEightyPercentFull() {
        final ParkingLot parkingLot = new ParkingLot(5);

        parkingLot.addObserver((s) -> assertEquals(ParkingLotStatus.EIGHTY_PERCENT_FULL, s));

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
    }
}
