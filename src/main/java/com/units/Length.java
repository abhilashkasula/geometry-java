package com.units;

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return this.isEqual(length);
    }

    private boolean isEqual(Length length) {
        final double thisInches = this.unit.toInch(this.value);
        final double otherInches = length.unit.toInch(length.value);
        return Double.compare(thisInches, otherInches) == 0;
    }
}
