package math.measurements;

public class Length extends Measurement {

    public Length(double value, LengthUnit lengthUnit) {
        super(value, lengthUnit);
    }

    public Length add(Length other) {
        final double thisBaseValue = this.unit.toBase(this.value);
        final double otherBaseValue = other.unit.toBase(other.value);
        final double sum = thisBaseValue + otherBaseValue;

        return new Length(sum, LengthUnit.INCH);
    }
}
