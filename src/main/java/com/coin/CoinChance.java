package com.coin;

public class CoinChance {

  private final int noOfCoins;

  public CoinChance(int noOfCoins) {

    this.noOfCoins = noOfCoins;
  }

  public double gettingTails() {
    final double pow = Math.pow(2, this.noOfCoins);
    return 1 / pow;
  }

  public double notGettingTails() {
    return 1 - this.gettingTails();
  }
}
