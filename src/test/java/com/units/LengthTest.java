package com.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LengthTest {
    @Test
    void shouldGiveTrueForTwoEqualLengths() {
        final Length length1 = new Length(1, Unit.FEET);
        final Length length2 = new Length(300, Unit.MILLIMETER);
        assertEquals(length2, length1);
        assertEquals(length1, length2);
    }

    @Test
    void shouldGiveFalseForTwoDifferentLengths() {
        final Length length1 = new Length(1, Unit.FEET);
        final Length length2 = new Length(299, Unit.MILLIMETER);
        assertNotEquals(length2, length1);
        assertNotEquals(length1, length2);
    }
}
