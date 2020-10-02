package math.probability;

import java.util.Objects;

public class Probability {
    public static final int MAX_PROBABILITY = 1;
    private final double value;

    public Probability(double value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }

    public Probability or(Probability other) {
        final Probability complementOfOther = other.complement();
        return this.complement().and(complementOfOther).complement();
    }

    public Probability complement() {
        return new Probability(MAX_PROBABILITY - this.value);
    }

    public Probability and(Probability other) {
        return new Probability(this.value * other.value);
    }
}
