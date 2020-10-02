package math.geometry;

import math.geometry.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculateAreaOfRectangle() {
        final Rectangle rectangle = new Rectangle(3.0, 2.0);
        assertEquals(6.0, rectangle.area());
    }

    @Test
    void shouldCalculatePerimeterOfRectangle() {
        final Rectangle rectangle = new Rectangle(3.0, 2.0);
        assertEquals(10.0, rectangle.perimeter());
    }

    @Test
    void shouldPrintRectangleProperties() {
        final Rectangle rectangle = new Rectangle(3.0, 2.0);
        rectangle.print((l, b, a, p) -> {
            assertEquals(3.0, l);
            assertEquals(2.0, b);
            assertEquals(6.0, a);
            assertEquals(10.0, p);
        });
    }
}
