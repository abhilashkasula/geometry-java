package com.coin;

public class CoinChance {

  private final int noOfCoins;

  public CoinChance(int noOfCoins) {

    this.noOfCoins = noOfCoins;
  }

  public double gettingTails() {
    final double sides = Math.pow(2, this.noOfCoins);
    return 1 / sides;
  }

  public double notGettingTails() {
    return 1 - this.gettingTails();
  }
}
