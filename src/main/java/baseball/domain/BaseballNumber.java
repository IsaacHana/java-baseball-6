package baseball.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class BaseballNumber {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final Map<Integer, BaseballNumber> numberCache = new HashMap<>();

    static {
        IntStream.range(MIN_NUMBER, MAX_NUMBER + 1).forEach((number) -> numberCache.put(number, new BaseballNumber(number)));
    }

    private final int number;

    private BaseballNumber(int number) {
        this.number = number;
    }

    public static BaseballNumber valueOf(int number) {
        validateNumber(number);
        return numberCache.get(number);
    }

    private static void validateNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 숫자입니다. 1~9 사이 숫자를 입력하세요.");
        }
    }
}
