package geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void shouldCalculateTheAreOfSquare() {
        final Square square = new Square(5.0);
        assertEquals(25.0, square.area());
    }
}
