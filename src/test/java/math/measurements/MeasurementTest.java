package math.measurements;

import math.measurements.LengthUnit;
import math.measurements.Measurement;
import math.measurements.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    void shouldGiveTrueForTwoEqualMeasurements() {
        final Measurement measurement1 = new Measurement(1, LengthUnit.FEET);
        final Measurement measurement2 = new Measurement(12, LengthUnit.INCH);
        assertEquals(measurement1, measurement2);
    }

    @Test
    void shouldGiveFalseForTwoDifferentMeasurements() {
        final Measurement measurement1 = new Measurement(1, VolumeUnit.GALLON);
        final Measurement measurement2 = new Measurement(3, VolumeUnit.LITER);
        assertNotEquals(measurement1, measurement2);
    }
}