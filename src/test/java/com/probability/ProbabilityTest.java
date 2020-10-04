package com.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
    @Test
    void shouldComplementTheProbability() {
        final Probability probability = new Probability(0.49);
        final Probability expectedProbability = new Probability(0.51);
        assertEquals(expectedProbability, probability.complement());
    }

    @Test
    void shouldPerformAndOnTwoProbabilities() {
        final Probability probability1 = new Probability(0.49);
        final Probability probability2 = new Probability(0.51);
        final Probability expectedProbability = new Probability(0.2499);
        assertEquals(expectedProbability, probability1.and(probability2));
    }

    @Test
    void shouldPerformOrOnTwoProbabilities() {
        final Probability probability1 = new Probability(0.49);
        final Probability probability2 = new Probability(0.51);
        final Probability probability = new Probability(0.7501);
        assertEquals(probability, probability1.or(probability2));
    }
}
