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
        return Objects.hash(this.unit.toInch(this.value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return this.isEqualTo(length);
    }

    private boolean isEqualTo(Length other) {
        final double thisInches = this.unit.toInch(this.value);
        final double otherInches = other.unit.toInch(other.value);
        return Double.compare(thisInches, otherInches) == 0;
    }
}
