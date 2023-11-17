package baseball.commonRules;

public enum Rules {
    MAX_SIZE(3),
    MIN_NUMBER(1),
    MAX_NUMBER(9);

    private final int value;

    Rules(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
