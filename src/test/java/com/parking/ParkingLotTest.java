package com.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
    void shouldRegisterFullObserver() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertTrue(parkingLot.registerFullObserver(new Attendant()));
    }

    @Test
    void shouldRegisterAlmostFullObserver() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertTrue(parkingLot.registerAlmostFullObserver(new Attendant()));
    }

    @Test
    void shouldNotifyRegisteredObserversWhenParkingLotIsFull() {
        final ParkingLot parkingLot = new ParkingLot(5);
        final Observer observerMock = mock(Observer.class);

        parkingLot.registerFullObserver(observerMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        verify(observerMock, times(1)).observe(ParkingLotStatus.FULL);
    }

    @Test
    void shouldNotifyRegisteredObserversWhenEightyPercentFull() {
        final ParkingLot parkingLot = new ParkingLot(5);
        final Observer observerMock = mock(Observer.class);

        parkingLot.registerAlmostFullObserver(observerMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        verify(observerMock, times(1)).observe(ParkingLotStatus.ALMOST_FULL);
    }
}
