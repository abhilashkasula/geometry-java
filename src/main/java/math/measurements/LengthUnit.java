package math.measurements;

public enum LengthUnit implements Unit{
    INCH(1), FEET(12), CENTIMETER(0.4), MILLIMETER(0.04);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double toBase(double value) {
        return this.conversionFactor * value;
    }
}
