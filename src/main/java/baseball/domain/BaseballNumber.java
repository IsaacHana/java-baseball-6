package baseball.domain;

public class BaseballNumber {
    private final int number;

    private BaseballNumber(int number) {
        this.number = number;
    }

    public static BaseballNumber valueOf(int number) {
        validateNumber(number);
        return new BaseballNumber(number);
    }

    private static void validateNumber(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 숫자입니다. 1~9 사이 숫자를 입력하세요.");
        }
    }
}
