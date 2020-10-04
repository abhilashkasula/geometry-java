package com.measurements;

public class Volume extends Measurement {

    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    public Volume add(Volume other) {
        final double thisBaseValue = this.unit.toBase(this.value);
        final double otherBaseValue = other.unit.toBase(other.value);
        final double sum = thisBaseValue + otherBaseValue;

        System.out.println(sum);

        return new Volume(sum, VolumeUnit.LITRE);
    }
}
