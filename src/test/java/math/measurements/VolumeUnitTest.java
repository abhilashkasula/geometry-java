package math.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VolumeUnitTest {

    @Test
    void shouldConvertGallonValueToLiterValue() {
        assertEquals(3.78, VolumeUnit.GALLON.toBase(1));
    }

    @Test
    void shouldGetSameLitreForLitreConversion() {
        assertEquals(1, VolumeUnit.LITER.toBase(1));
    }
}