package geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculateAreaOfRectangle() {
        final Rectangle rectangle = new Rectangle(3.0, 2.0);
        final double area = rectangle.area();
        assertEquals(6.0, area);
    }

    @Test
    void shouldCalculatePerimeterOfRectangle() {
        final Rectangle rectangle = new Rectangle(3.0, 2.0);
        final double perimeter = rectangle.perimeter();
        assertEquals(10.0, perimeter);
    }
}
