package math.measurements;

public enum VolumeUnit implements Unit{
    LITRE(1), GALLON(3.78);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double toBase(double value) {
        return this.conversionFactor * value;
    }
}
