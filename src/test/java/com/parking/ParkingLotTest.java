package com.parking;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
    void shouldAddObserver() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertTrue(parkingLot.addObserver(new Attendant()));
    }

    @Test
    void shouldNotifyObserversWhenParkingLotIsFull() {
        final ParkingLot parkingLot = new ParkingLot(5);
        final Observer observerMock = mock(Observer.class);

        parkingLot.addObserver(observerMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        verify(observerMock, times(1)).observe(ParkingLotStatus.FULL);
    }

    @Test
    void shouldNotifyObserversWhenEightyPercentFull() {
        final ParkingLot parkingLot = new ParkingLot(5);
        final Observer observerMock = mock(Observer.class);

        parkingLot.addObserver(observerMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        verify(observerMock, times(1)).observe(ParkingLotStatus.EIGHTY_PERCENT_FULL);
    }
}
