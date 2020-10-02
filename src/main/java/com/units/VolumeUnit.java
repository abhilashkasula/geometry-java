package com.units;

public enum VolumeUnit implements Unit{
    GALLON(3.78), LITER(1);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double toBase(double value) {
        return this.conversionFactor * value;
    }
}
