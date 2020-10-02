package com.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LengthTest {
    @Test
    void shouldGiveTrueForTwoEqualLengths() {
        final Length length1 = new Length(1, LengthUnit.FEET);
        final Length length2 = new Length(300, LengthUnit.MILLIMETER);
        assertEquals(length2, length1);
        assertEquals(length1, length2);
    }

    @Test
    void shouldGiveFalseForTwoDifferentLengths() {
        final Length length1 = new Length(1, LengthUnit.FEET);
        final Length length2 = new Length(299, LengthUnit.MILLIMETER);
        assertNotEquals(length2, length1);
        assertNotEquals(length1, length2);
    }

    @Test
    void shouldAddTwoLengths() {
        final Length length1 = new Length(2, LengthUnit.INCH);
        final Length length2 = new Length(1, LengthUnit.INCH);
        final Length expectedLength = new Length(3, LengthUnit.INCH);
        assertEquals(expectedLength, length1.add(length2));
    }
}
