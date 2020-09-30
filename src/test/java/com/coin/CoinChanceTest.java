package com.coin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChanceTest {
    @Test
    void shouldGetChanceOfGettingTail() {
        final CoinChance coinChance = new CoinChance(1);
        assertEquals(0.5, coinChance.gettingTails());
    }

    @Test
    void shouldGetChanceOfGettingHead() {
        final CoinChance coinChance = new CoinChance(1);
        assertEquals(0.5, coinChance.notGettingTails());
    }

    @Test
    void shouldGetChanceOfGettingTwoTails() {
        final CoinChance coinChance = new CoinChance(2);
        assertEquals(0.25, coinChance.gettingTails());
    }
}
