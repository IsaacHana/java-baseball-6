package baseball.domain;

import java.util.Arrays;
import java.util.List;

public class User {
    private final BaseballNumbers numbers;

    private User(BaseballNumbers numbers) {
        this.numbers = numbers;
    }

    public static User valueOf(BaseballNumbers numbers) {
        return new User(numbers);
    }

    public static User valueOf(List<Integer> numbers) {
        return valueOf(BaseballNumbers.createByIntegerList(numbers));
    }

    public static User valueOf(String input) {
        try {
            List<Integer> numbers = Arrays.stream(input.split("")).map(Integer::parseInt).toList();
            return valueOf(numbers);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 숫자입니다.");
        }
    }
}
