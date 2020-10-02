package com.measurements;

public class Length extends Measurement {

    public Length(double value, LengthUnit lengthUnit) {
        super(value, lengthUnit);
    }

    public Length add(Length other) {
        return new Length(this.value + other.value, (LengthUnit) this.unit);
    }
}
