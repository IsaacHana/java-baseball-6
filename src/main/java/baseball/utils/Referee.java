package baseball.utils;

import baseball.commonRules.ContinueRules;
import baseball.domain.count.ResultType;
import baseball.domain.BaseballNumber;

import java.util.*;

public class Referee {
    private final Map<ResultType, Integer> gameResult;

    private Referee(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers) {
        gameResult = ResultType.calculateResult(computerNumbers, userNumbers);
    }

    public static Referee calculateResult(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers) {
        return new Referee(computerNumbers, userNumbers);
    }

    public static boolean equals(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers) {
        if(computerNumbers == null || userNumbers == null) {
            return false;
        }
        return Objects.equals(computerNumbers, userNumbers);
    }

    public static boolean continues(String userIntention) {
        return Objects.equals(userIntention, ContinueRules.CONTINUE.getValue());
    }

    public Map<ResultType, Integer> getGameResult() {
        return Collections.unmodifiableMap(gameResult);
    }
}
