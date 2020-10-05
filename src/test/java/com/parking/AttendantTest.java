package com.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AttendantTest {
    @Test
    void shouldParkTheCar() {
        final ParkingLot parkingLot = new ParkingLot(1);
        final Attendant attendant = new Attendant();

        attendant.addParkingLot(parkingLot);

        assertTrue(attendant.park());
    }

    @Test
    void shouldAddParkingLot() {
        final ParkingLot parkingLot = new ParkingLot(2);
        final Attendant attendant = new Attendant();

        assertTrue(attendant.addParkingLot(parkingLot));

    }

    @Test
    void shouldNotParkTheCarWhenAllTheParkingLotsFull() {
        final ParkingLot parkingLot1 = new ParkingLot(1);
        final ParkingLot parkingLot2 = new ParkingLot(2);
        final Attendant attendant = new Attendant();

        attendant.addParkingLot(parkingLot1);
        attendant.addParkingLot(parkingLot2);

        attendant.park();
        attendant.park();
        attendant.park();

        assertFalse(attendant.park());
    }

    @Test
    void shouldNotifyAlmostFullParkingLots() {
        final Attendant attendant = new Attendant();
        final ParkingLot parkingLot = new ParkingLot(5);
        final AttendantObserver observerMock = mock(AttendantObserver.class);

        attendant.addParkingLot(parkingLot);
        attendant.registerObserver(observerMock);

        parkingLot.registerObserver(attendant);

        attendant.park();
        attendant.park();
        attendant.park();
        attendant.park();

        verify(observerMock).onStatusUpdate();
    }
}
