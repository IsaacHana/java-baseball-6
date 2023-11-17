package baseball.domain;

import baseball.utils.RandomNumbersGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ComputerTest {
    @DisplayName("컴퓨터 번호 생성 테스트")
    @Test
    void createWithNumbers() {
        Computer.createWithNumbers(BaseballNumbers.create(List.of(BaseballNumber.valueOf(1), BaseballNumber.valueOf(3), BaseballNumber.valueOf(5))));
    }

    @DisplayName("컴퓨터 번호 리스트 입력시 생성 테스트")
    @Test
    void fromIntegerList() {
        Computer.fromIntegerList(List.of(1,3,5));
    }

    @DisplayName("컴퓨터 번호 리스트 입력시 생성 테스트")
    @Test
    void createWithRandomNumbers() {
        Computer.createWithRandomNumbers(new RandomNumbersGenerator());
    }
}