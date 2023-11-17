package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseballNumberTest {
    @DisplayName("생성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void create(int validNumber) {
        assertThat(BaseballNumber.valueOf(validNumber)).isNotInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("1~9가 아닌 숫자는 예외가 발생함")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 10})
    void createByInvalidNumber(int invalidNumber) {
        assertThatThrownBy(() -> BaseballNumber.valueOf(invalidNumber)).isInstanceOf(IllegalArgumentException.class);
    }
}