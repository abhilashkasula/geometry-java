package com.measurements;

public enum TemperatureUnit implements Unit {
    CELSIUS(0, 1), FAHRENHEIT(32, 5 / 9.0);

    private final double offset;
    private final double times;

    TemperatureUnit(double offset, double times) {
        this.offset = offset;
        this.times = times;
    }

    @Override
    public double toBase(double value) {
        return (value - this.offset) * this.times;
    }
}
