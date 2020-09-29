package coin;

public enum CoinFace {
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
