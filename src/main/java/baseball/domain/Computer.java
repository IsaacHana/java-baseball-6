package baseball.domain;

import baseball.utils.NumbersGenerator;

import java.util.List;

public class Computer {
    private final BaseballNumbers numbers;

    private Computer(BaseballNumbers numbers) {
        this.numbers = numbers;
    }

    public static Computer createWithNumbers(BaseballNumbers numbers) {
        return new Computer(numbers);
    }

    public static Computer fromIntegerList(List<Integer> numbers) {
        return createWithNumbers(BaseballNumbers.createByIntegerList(numbers));
    }

    /**
     * 난수 생성기를 이용하여 Computer 객체를 생성합니다.
     *
     * @param numbersGenerator 난수 생성기
     * @return Computer 객체
     */
    public static Computer createWithRandomNumbers(NumbersGenerator numbersGenerator) {
        return fromIntegerList(numbersGenerator.generate());
    }

    public BaseballNumbers getNumbers() {
        return numbers;
    }
}
