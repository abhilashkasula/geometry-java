package com.parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private final Map<ParkingLotStatus, Observer> observers;
    private int storage;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.observers = new HashMap<>();
    }

    public boolean park() {
        if (this.isFull()) {
            return false;
        }

        this.storage++;

        this.notifyObservers();

        return true;
    }

    private boolean isFull() {
        return this.capacity == this.storage;
    }

    private void notifyObservers() {
        this.observers.forEach((parkingLotStatus, observer) -> {
            if (parkingLotStatus.isValueEqual(this.getStoragePercentage())) {
                observer.observe(parkingLotStatus);
            }
        });
    }

    private double getStoragePercentage() {
        return (this.storage * 100.0) / this.capacity;
    }

    public void registerObserver(ParkingLotStatus status, Observer observer) {
        this.observers.put(status, observer);
    }
}
