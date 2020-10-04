package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int capacity;
    private int storage;
    private final List<Observer> observers;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.observers = new ArrayList<>();
    }

    public boolean park() {
        if (this.isFull()) {
            return false;
        }

        this.storage++;

        if (this.isEightyPercentFull()) {
            this.notifyObservers(ParkingLotStatus.EIGHTY_PERCENT_FULL);
        }

        if (this.isFull() ) {
            this.notifyObservers(ParkingLotStatus.FULL);
        }

        return true;
    }

    private boolean isEightyPercentFull() {
        return (this.storage * 100) / this.capacity >= 80;
    }

    private void notifyObservers(ParkingLotStatus status) {
        this.observers.forEach((observer) -> observer.observe(status));
    }

    public boolean addObserver(Observer observer) {
        return this.observers.add(observer);
    }

    private boolean isFull() {
        return this.capacity == this.storage;
    }
}
