package baseball.commonRules;

public enum ContinueRules {
    CONTINUE("1"),
    QUIT("2");

    private final String value;

    ContinueRules(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
