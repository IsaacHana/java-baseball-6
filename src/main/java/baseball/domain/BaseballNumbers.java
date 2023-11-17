package baseball.domain;

import baseball.commonRules.Rules;

import java.util.List;
import java.util.Objects;

public class BaseballNumbers {
    private final List<BaseballNumber> numbers;

    private BaseballNumbers(List<BaseballNumber> numbers) {
        validate(numbers);
        this.numbers = List.copyOf(numbers);
    }

    public static BaseballNumbers create(List<BaseballNumber> numbers) {
        return new BaseballNumbers(numbers);
    }

    public static BaseballNumbers createByIntegerList(List<Integer> numbers) {
        return create(numbers.stream().map(BaseballNumber::valueOf).toList());
    }

    private void validate(List<BaseballNumber> numbers) {
        validateSize(numbers);
        validateDuplication(numbers);
    }

    private void validateSize(List<BaseballNumber> numbers) {
        if (numbers.size() != Rules.MAX_SIZE.getValue()) {
            throw new IllegalArgumentException("[ERROR] %d자리 숫자를 입력해주세요.".formatted(Rules.MAX_SIZE.getValue()));
        }
    }

    private void validateDuplication(List<BaseballNumber> numbers) {
        if (numbers.stream().distinct().count() != Rules.MAX_SIZE.getValue()) {
            throw new IllegalArgumentException("[ERROR] 서로 다른 숫자를 입력해주세요.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        BaseballNumbers baseballNumbers = (BaseballNumbers) obj;
        return Objects.equals(this.numbers, baseballNumbers.numbers);
    }
}
