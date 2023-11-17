package baseball.commonRules;

public enum ResultType {
    BALL("볼"), STRIKE("스트라이크"), NOTHING("낫싱");

    private final String name;

    ResultType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}