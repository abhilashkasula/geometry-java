package com.probability;

import java.util.Objects;

public class Probability {
  public static final int MAX_PROBABILITY = 1;
  private final double value;

  public Probability(double value) {
    this.value = value;
  }

  public Probability complement() {
    return new Probability(MAX_PROBABILITY - this.value);
  }

  public Probability combine(Probability probability) {
    return new Probability(this.value * probability.value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Probability that = (Probability) o;
    return Double.compare(that.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
