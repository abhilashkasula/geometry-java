package com.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VolumeTest {
    @Test
    void shouldGiveTrueForTwoEqualVolumes() {
        final Volume volume1 = new Volume(1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.78, VolumeUnit.LITRE);

        assertEquals(volume1, volume2);
    }

    @Test
    void shouldGiveFalseForTwoDifferentVolumes() {
        final Volume volume1 = new Volume(1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.8, VolumeUnit.LITRE);

        assertNotEquals(volume1, volume2);
    }

    @Test
    void shouldAddTwoVolumes() {
        final Volume volume1 = new Volume(1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.78, VolumeUnit.LITRE);
        final Volume expectedVolume = new Volume(7.56, VolumeUnit.LITRE);

        assertEquals(expectedVolume, volume1.add(volume2));
    }
}
