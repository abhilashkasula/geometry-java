package math.measurements;

import math.measurements.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthUnitTest {

    @Test
    void shouldConvertFeetValueToInchValue() {
        assertEquals(12, LengthUnit.FEET.toBase(1));
    }

    @Test
    void shouldGetSameInchValueForInchConversion() {
        assertEquals(1, LengthUnit.INCH.toBase(1));
    }

    @Test
    void shouldConvertCentimeterValueToInchValue() {
        assertEquals(1, LengthUnit.CENTIMETER.toBase(2.5));
    }

    @Test
    void shouldConvertMillimeterValueToInchValue() {
        assertEquals(1, LengthUnit.MILLIMETER.toBase(25));
    }
}