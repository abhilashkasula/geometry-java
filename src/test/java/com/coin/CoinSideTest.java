package com.coin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinSideTest {
    @Test
    void shouldGetChanceOfGettingTail() {
        assertEquals(0.5, CoinSide.TAIL.chance());
    }

    @Test
    void shouldGetChanceOfGettingHead() {
        assertEquals(0.5, CoinSide.HEAD.chance());
    }
}