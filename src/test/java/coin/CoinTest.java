package coin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {
    @Test
    void shouldGetProbabilityOfGettingTaleWhenFlipped() {
        assertEquals(0.5, Coin.probabilityOfTail());
    }
}