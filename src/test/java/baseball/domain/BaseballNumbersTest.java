package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseballNumbersTest {
    @DisplayName("생성 테스트")
    @Test
    void create() {
        BaseballNumbers baseballNumbers = BaseballNumbers.create(
                List.of(
                        BaseballNumber.valueOf(1),
                        BaseballNumber.valueOf(2),
                        BaseballNumber.valueOf(3)
                )
        );
    }

    @DisplayName("List<Integer> 형으로 생성 테스트")
    @Test
    void createByIntegerList() {
        BaseballNumbers baseballNumbers = BaseballNumbers.createByIntegerList(
                List.of(
                        1,
                        2,
                        3
                )
        );
    }

    @DisplayName("3자리 숫자가 아니라면 예외 발생")
    @Test
    void createByNonThreeDigit() {
        assertThatThrownBy(() -> BaseballNumbers.create(
                List.of(
                        BaseballNumber.valueOf(1),
                        BaseballNumber.valueOf(2),
                        BaseballNumber.valueOf(3),
                        BaseballNumber.valueOf(4)
                )
        )).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("서로 다른 숫자가 아니라면 예외 발생")
    @Test
    void createByDuplicateNumbers() {
        assertThatThrownBy(() -> BaseballNumbers.create(
                List.of(
                        BaseballNumber.valueOf(1),
                        BaseballNumber.valueOf(2),
                        BaseballNumber.valueOf(1)
                )
        )).isInstanceOf(IllegalArgumentException.class);
    }
}