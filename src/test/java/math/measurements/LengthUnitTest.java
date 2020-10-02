package math.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthUnitTest {

    @Test
    void shouldConvertFeetValueToMilliMeterValue() {
        assertEquals(600, LengthUnit.FEET.toBase(2));
    }

    @Test
    void shouldConvertInchValueToMilliMeterValue() {
        assertEquals(50, LengthUnit.INCH.toBase(2));
    }

    @Test
    void shouldConvertCentimeterValueToMilliMeterValue() {
        assertEquals(20, LengthUnit.CENTIMETER.toBase(2));
    }

    @Test
    void shouldGetSameMilliMeterValueForMilliMeterConversion() {
        assertEquals(2, LengthUnit.MILLIMETER.toBase(2));
    }

    @Test
    void shouldConvertMilliMeterValueToFeetValue() {
        assertEquals(2, LengthUnit.FEET.toUpper(600));
    }

    @Test
    void shouldConvertMilliMeterValueToInchValue() {
        assertEquals(2, LengthUnit.INCH.toUpper(50));
    }

    @Test
    void shouldConvertMilliMeterValueToCentimeterValue() {
        assertEquals(2, LengthUnit.CENTIMETER.toUpper(20));
    }
}