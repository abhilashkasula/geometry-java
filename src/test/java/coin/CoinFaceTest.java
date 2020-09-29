package coin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinFaceTest {
    @Test
    void shouldGetChanceOfGettingTail() {
        assertEquals(0.5, CoinFace.TAIL.chance());
    }

    @Test
    void shouldGetChanceOfGettingHead() {
        assertEquals(0.5, CoinFace.HEAD.chance());
    }
}