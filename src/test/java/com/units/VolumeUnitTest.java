package com.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeUnitTest {

    @Test
    void shouldConvertGallonValueToLiterValue() {
        assertEquals(3.78, VolumeUnit.GALLON.toBase(1));
    }
}