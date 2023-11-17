package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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

    @DisplayName("동등성 테스트")
    @Test
    void equals() {
        BaseballNumbers baseballNumbers1 = BaseballNumbers.createByIntegerList(List.of(1,2,3));
        BaseballNumbers baseballNumbers2 = BaseballNumbers.createByIntegerList(List.of(1,2,3));
        assertThat(baseballNumbers1.equals(baseballNumbers2)).isTrue();
    }

    @DisplayName("순서가 달라지면 동등하지 않아야한다")
    @Test
    void equalsByInvalidOrder() {
        BaseballNumbers baseballNumbers1 = BaseballNumbers.createByIntegerList(List.of(1,2,3));
        BaseballNumbers baseballNumbers2 = BaseballNumbers.createByIntegerList(List.of(3,2,1));
        assertThat(baseballNumbers1.equals(baseballNumbers2)).isTrue();
    }

    @DisplayName("포함 테스트")
    @Test
    void contains() {
        BaseballNumbers baseballNumbers1 = BaseballNumbers.createByIntegerList(List.of(1,2,3));
        assertThat(baseballNumbers1.contains(BaseballNumber.valueOf(3))).isTrue();
        assertThat(baseballNumbers1.contains(BaseballNumber.valueOf(2))).isTrue();
        assertThat(baseballNumbers1.contains(BaseballNumber.valueOf(1))).isTrue();
    }
}