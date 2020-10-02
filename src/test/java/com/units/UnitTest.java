package com.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest {

    @Test
    void shouldConvertFeetValueToInchValue() {
        assertEquals(12, Unit.FEET.toInch(1));
    }

    @Test
    void shouldGetSameInchValueForInchConversion() {
        assertEquals(1, Unit.INCH.toInch(1));
    }

    @Test
    void shouldConvertCentimeterValueToInchValue() {
        assertEquals(1, Unit.CENTIMETER.toInch(2.5));
    }

    @Test
    void shouldConvertMillimeterValueToInchValue() {
        assertEquals(1, Unit.MILLIMETER.toInch(25));
    }
}