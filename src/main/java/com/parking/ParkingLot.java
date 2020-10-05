package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int capacity;
    private final List<ParkingLotObserver> observers;
    private int storage;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.observers = new ArrayList<>();
    }

    public boolean park() {
        if (this.isFull()) {
            return false;
        }

        this.storage++;

        if (this.isAlmostFull()) {
            this.notifyObservers(ParkingLotStatus.ALMOST_FULL);
        }

        if (this.isFull()) {
            this.notifyObservers(ParkingLotStatus.FULL);
        }

        return true;
    }

    private boolean isFull() {
        return this.capacity == this.storage;
    }

    private boolean isAlmostFull() {
        return this.getStoragePercentage() == 80;
    }

    private void notifyObservers(ParkingLotStatus status) {
        this.observers.forEach((observer) -> observer.onStatusUpdate(status));
    }

    private int getStoragePercentage() {
        return (this.storage * 100) / this.capacity;
    }

    public void registerObserver(ParkingLotObserver parkingLotObserver) {
        this.observers.add(parkingLotObserver);
    }

    public boolean unPark() {
        if (this.storage == 0) {
            return false;
        }

        this.storage--;

        if (this.isTwentyPercentOrLessFull()) {
            this.notifyObservers(ParkingLotStatus.TWENTY_PERCENT_FULL);
        }

        return true;
    }

    private boolean isTwentyPercentOrLessFull() {
        return this.getStoragePercentage() <= 20;
    }
}
