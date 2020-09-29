package com.coin;

public enum CoinSide {
    TAIL {
        @Override
        double chance() {
            return 0.5;
        }
    }, HEAD {
        @Override
        double chance() {
            return 0.5;
        }
    };

    abstract double chance();
}
