package com.parking;

import java.util.ArrayList;
import java.util.List;

public class Attendant implements ParkingLotObserver {
    private final List<ParkingLot> parkingLots;
    private final List<AttendantObserver> observers;
    private int eightyPercentFullLots;

    public Attendant() {
        this.parkingLots = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.eightyPercentFullLots = 0;
    }

    public boolean addParkingLot(ParkingLot parkingLot) {
        return this.parkingLots.add(parkingLot);
    }

    public boolean park() {
        boolean result = false;

        for (ParkingLot parkingLot : this.parkingLots) {
            result = result || parkingLot.park();
        }

        if (this.eightyPercentFullLots == this.parkingLots.size()) {
            this.notifyObservers();
        }

        return result;
    }

    private void notifyObservers() {
        this.observers.forEach(attendantObserver -> attendantObserver.onStatusUpdate());
    }

    @Override
    public void onStatusUpdate(ParkingLotStatus status) {
        if (ParkingLotStatus.ALMOST_FULL == status) {
            this.eightyPercentFullLots++;
        }
    }

    public void registerObserver(AttendantObserver observer) {
        this.observers.add(observer);
    }
}
