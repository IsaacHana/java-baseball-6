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
        if (computerNumbers == null || userNumbers == null) {
            return false;
        }
        return Objects.equals(computerNumbers, userNumbers);
    }

    public static boolean continues(String userIntention) {
        if (ContinueRules.containsRule(userIntention)) {
            throw new IllegalArgumentException("[ERROR] %s 또는 %s 를 입력해주세요.".formatted(ContinueRules.CONTINUE.getValue(), ContinueRules.QUIT.getValue()));
        }
        return ContinueRules.continuesGame(userIntention);
    }

    public Map<ResultType, Integer> getGameResult() {
        return Collections.unmodifiableMap(gameResult);
    }
}
