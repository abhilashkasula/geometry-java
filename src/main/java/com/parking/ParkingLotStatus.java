package com.parking;

public enum ParkingLotStatus {
    ALMOST_FULL(80), FULL(100);

    private final double percentage;

    ParkingLotStatus(double percentage) {
        this.percentage = percentage;
    }

    public boolean isValueEqual(double value) {
        return this.percentage == value;
    }
}
