package math.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthUnitTest {

    @Test
    void shouldConvertFeetValueToMilliMeterValue() {
        assertEquals(300, LengthUnit.FEET.toBase(1));
    }

    @Test
    void shouldGetSameMilliMeterValueForMilliMeterConversion() {
        assertEquals(1, LengthUnit.MILLIMETER.toBase(1));
    }

    @Test
    void shouldConvertCentimeterValueToMilliMeterValue() {
        assertEquals(10, LengthUnit.CENTIMETER.toBase(1));
    }

    @Test
    void shouldConvertInchValueToMilliMeterValue() {
        assertEquals(25, LengthUnit.INCH.toBase(1));
    }
}