package math.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VolumeUnitTest {

    @Test
    void shouldConvertGallonValueToLiterValue() {
        assertEquals(7.56, VolumeUnit.GALLON.toBase(2));
    }

    @Test
    void shouldGetSameLitreForLitreConversion() {
        assertEquals(2, VolumeUnit.LITRE.toBase(2));
    }
}