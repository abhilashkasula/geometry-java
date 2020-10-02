package com.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VolumeTest {
    @Test
    void shouldGiveTrueForTwoEqualVolumes() {
        final Volume volume1 = new Volume(1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.78, VolumeUnit.LITER);
        assertEquals(volume1, volume2);
    }

    @Test
    void shouldGiveFalseForTwoDifferentVolumes() {
        final Volume volume1 = new Volume(1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.8, VolumeUnit.LITER);
        assertNotEquals(volume1, volume2);
    }
}
