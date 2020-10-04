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
    void shouldNotifyRegisteredObservers() {
        final ParkingLot parkingLot1 = new ParkingLot(5);
        final Observer observerMock1 = mock(Observer.class);
        final Observer observerMock2 = mock(Observer.class);

        parkingLot1.registerObserver(ParkingLotStatus.FULL, observerMock1);
        parkingLot1.registerObserver(ParkingLotStatus.ALMOST_FULL, observerMock2);

        parkingLot1.park();
        parkingLot1.park();
        parkingLot1.park();
        parkingLot1.park();
        parkingLot1.park();

        verify(observerMock2, times(1)).observe(ParkingLotStatus.ALMOST_FULL);
        verify(observerMock1, times(1)).observe(ParkingLotStatus.FULL);
    }

    @Test
    void shouldNotNotifyRegisteredObservers() {
        final ParkingLot parkingLot = new ParkingLot(5);
        final Observer observerMock = mock(Observer.class);

        parkingLot.registerObserver(ParkingLotStatus.ALMOST_FULL, observerMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        verifyNoMoreInteractions(observerMock);
    }
}
