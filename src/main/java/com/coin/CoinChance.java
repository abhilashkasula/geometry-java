package com.coin;

public class CoinChance {
  private final int noOfCoins;

  public CoinChance(int noOfCoins) {
    this.noOfCoins = noOfCoins;
  }

  public double gettingTails() {
    final double possibleOutcomes = Math.pow(2, this.noOfCoins);
    return 1 / possibleOutcomes;
  }

  public double notGettingTails() {
    return 1 - this.gettingTails();
  }
}
