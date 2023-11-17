package baseball.domain;

import java.util.List;

public class BaseballNumbers {
    private final List<BaseballNumber> numbers;

    private BaseballNumbers(List<BaseballNumber> numbers) {
        this.numbers = numbers;
    }

    public static BaseballNumbers valueOf(List<BaseballNumber> numbers) {
        return new BaseballNumbers(numbers);
    }
}
