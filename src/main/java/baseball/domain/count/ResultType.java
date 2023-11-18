package baseball.domain.count;

import baseball.domain.BaseballNumber;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public enum ResultType {
    BALL("볼", new BallCounter()),
    STRIKE("스트라이크", new StrikeCounter());

    private final String name;
    private final Counter countFunction;

    ResultType(String name, Counter countFunction) {
        this.name = name;
        this.countFunction = countFunction;
    }

    public static Map<ResultType, Integer> calculateResult(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers) {
        Map<ResultType, Integer> result = new EnumMap<>(ResultType.class);

        for (ResultType resultType : values()) {
            result.put(resultType, resultType.countFunction.calculate(computerNumbers, userNumbers));
        }

        result.values().removeIf(value -> value <= 0);
        return result;
    }

    public String getName() {
        return name;
    }
}
