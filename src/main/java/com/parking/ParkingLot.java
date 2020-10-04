package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int capacity;
    private final List<Observer> fullObservers;
    private final List<Observer> almostFullObservers;
    private int storage;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.fullObservers = new ArrayList<>();
        this.almostFullObservers = new ArrayList<>();
    }

    public boolean park() {
        if (this.isFull()) {
            return false;
        }

        this.storage++;

        if (this.isAlmostFull()) {
            this.notifyAlmostFullObservers();
        }

        if (this.isFull()) {
            this.notifyFullObservers();
        }

        return true;
    }

    private boolean isFull() {
        return this.capacity == this.storage;
    }

    private boolean isAlmostFull() {
        return (this.storage * 100) / this.capacity >= 80;
    }

    private void notifyAlmostFullObservers() {
        this.almostFullObservers.forEach(observer -> observer.observe(ParkingLotStatus.ALMOST_FULL));
    }

    private void notifyFullObservers() {
        this.fullObservers.forEach((observer) -> observer.observe(ParkingLotStatus.FULL));
    }

    public boolean registerFullObserver(Observer observer) {
        return this.fullObservers.add(observer);
    }

    public boolean registerAlmostFullObserver(Observer observer) {
        return this.almostFullObservers.add(observer);
    }
}
