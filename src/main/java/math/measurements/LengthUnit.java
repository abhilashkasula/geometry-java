package math.measurements;

public enum LengthUnit implements Unit{
    MILLIMETER(1), CENTIMETER(10), INCH(25), FEET(300);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double toBase(double value) {
        return this.conversionFactor * value;
    }

    public double toUpper(double value) {
        return value / conversionFactor;
    }
}
