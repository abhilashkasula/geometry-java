package math.measurements;

import java.util.Objects;

public class Measurement {
    protected final double value;
    protected final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.unit.toBase(this.value));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Measurement measurement = (Measurement) object;
        return this.isEqualTo(measurement);
    }

    private boolean isEqualTo(Measurement other) {
        final double thisInches = this.unit.toBase(this.value);
        final double otherInches = other.unit.toBase(other.value);
        return Double.compare(thisInches, otherInches) == 0;
    }
}
