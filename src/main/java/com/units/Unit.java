package com.units;

public enum Unit {
    INCH(1), FEET(12), CENTIMETER(0.4), MILLIMETER(0.04);

    private final double inchValue;

    Unit(double inchValue) {
        this.inchValue = inchValue;
    }

    public double toInch(double value) {
        return this.inchValue * value;
    }
}
