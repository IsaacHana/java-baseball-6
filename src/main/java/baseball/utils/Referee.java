package baseball.utils;

import baseball.commonRules.ContinueRules;
import baseball.domain.BaseballNumbers;

import java.util.Objects;

public class Referee {
    public static boolean equals(BaseballNumbers computerNumbers,BaseballNumbers userNumbers) {
        return computerNumbers.equals(userNumbers);
    }

    public static boolean continues(String userIntention) {
        return Objects.equals(userIntention, ContinueRules.CONTINUE.getValue());
    }
}
