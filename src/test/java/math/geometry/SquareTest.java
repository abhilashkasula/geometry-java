package math.geometry;

import math.geometry.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void shouldCalculateTheAreaOfSquare() {
        final Square square = new Square(5.0);
        assertEquals(25.0, square.area());
    }

    @Test
    void shouldCalculateThePerimeterOfSquare() {
        final Square square = new Square(5.0);
        assertEquals(20.0, square.perimeter());
    }
}
