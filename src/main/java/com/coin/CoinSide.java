package com.coin;

public enum CoinSide {
  TAIL, HEAD;
  
  double chance() {
    double totalOutcomes = 2;
    double possibleOutcomes = 1;
    return possibleOutcomes / totalOutcomes;
  }
}
