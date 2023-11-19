package baseball.commonRules;

import java.util.Arrays;
import java.util.Objects;

public enum ContinueRules {
    CONTINUE("1"),
    QUIT("2");

    private final String value;

    ContinueRules(String value) {
        this.value = value;
    }

    public static boolean containsRule(String userIntention) {
        return Arrays.stream(values()).anyMatch(continueRules -> Objects.equals(userIntention, continueRules.value));
    }

    public static boolean continuesGame(String userIntention) {
        return Objects.equals(userIntention, CONTINUE.getValue());
    }

    public String getValue() {
        return value;
    }
}
