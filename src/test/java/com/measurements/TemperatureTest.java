package com.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TemperatureTest {
    @Test
    void shouldCompareTwoTemperatures() {
        final Temperature temperature1 = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        final Temperature temperature2 = new Temperature(100, TemperatureUnit.CELSIUS);

        assertEquals(temperature1, temperature2);
    }

    @Test
    void shouldNotCompareTwoTemperatures() {
        final Temperature temperature1 = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        final Temperature temperature2 = new Temperature(99, TemperatureUnit.CELSIUS);

        assertNotEquals(temperature1, temperature2);
    }
}
