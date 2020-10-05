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
        final ParkingLotObserver parkingLotObserverMock1 = mock(ParkingLotObserver.class);
        final ParkingLotObserver parkingLotObserverMock2 = mock(ParkingLotObserver.class);

        parkingLot1.registerObserver(parkingLotObserverMock1);
        parkingLot1.registerObserver(parkingLotObserverMock2);

        parkingLot1.park();
        parkingLot1.park();
        parkingLot1.park();
        parkingLot1.park();
        parkingLot1.park();

        verify(parkingLotObserverMock2, times(1)).onStatusUpdate(ParkingLotStatus.ALMOST_FULL);
        verify(parkingLotObserverMock1, times(1)).onStatusUpdate(ParkingLotStatus.FULL);
    }

    @Test
    void shouldNotNotifyRegisteredObservers() {
        final ParkingLot parkingLot = new ParkingLot(5);
        final ParkingLotObserver parkingLotObserverMock = mock(ParkingLotObserver.class);

        parkingLot.registerObserver(parkingLotObserverMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        verifyNoMoreInteractions(parkingLotObserverMock);
    }

    @Test
    void shouldUnParkTheCar() {
        final ParkingLot parkingLot = new ParkingLot(10);
        final ParkingLotObserver parkingLotObserverMock = mock(ParkingLotObserver.class);

        parkingLot.registerObserver(parkingLotObserverMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        assertTrue(parkingLot.unPark());
    }

    @Test
    void shouldNotUnParkTheCar() {
        final ParkingLot parkingLot = new ParkingLot(10);
        final ParkingLotObserver parkingLotObserverMock = mock(ParkingLotObserver.class);

        parkingLot.registerObserver(parkingLotObserverMock);

        assertFalse(parkingLot.unPark());
    }

    @Test
    void shouldNotifyTwentyPercentFull() {
        final ParkingLot parkingLot = new ParkingLot(10);
        final ParkingLotObserver parkingLotObserverMock = mock(ParkingLotObserver.class);

        parkingLot.registerObserver(parkingLotObserverMock);

        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        parkingLot.unPark();

        verify(parkingLotObserverMock).onStatusUpdate(ParkingLotStatus.TWENTY_PERCENT_FULL);
    }
}
