package baseball.domain.count;

import baseball.domain.BaseballNumber;
import baseball.domain.BaseballNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BallCounterTest {
    @DisplayName("볼 수 계산기 테스트")
    @Test
    void calculate() {
        List<BaseballNumber> computerNumbers = BaseballNumbers.createByIntegerList(List.of(1,2,3)).getNumbers();
        List<BaseballNumber> userNumbers = BaseballNumbers.createByIntegerList(List.of(1,3,2)).getNumbers();
        Counter counter = new BallCounter();

        assertThat(counter.calculate(computerNumbers, userNumbers)).isEqualTo(2);
    }
}