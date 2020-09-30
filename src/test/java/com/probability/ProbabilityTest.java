package com.probability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
    @Test
    void shouldComplementTheProbability() {
        final Probability probability = new Probability(0.5);
        final Probability expectedProbability = new Probability(0.5);
        assertEquals(expectedProbability, probability.complement());
    }

    @Test
    void shouldCombineTwoProbabilities() {
        final Probability probability1 = new Probability(0.5);
        final Probability probability2 = new Probability(0.5);
        final Probability expectedProbability = new Probability(0.25);
        assertEquals(expectedProbability, probability1.combine(probability2));
    }
}
