package baseball.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

class RandomNumbersGeneratorTest {
    @DisplayName("랜덤 번호 생성 테스트")
    @Test
    void create() {
        RandomNumbersGenerator randomNumbersGenerator = new RandomNumbersGenerator();
        assertRandomNumberInRangeTest(
                () -> {
                    assertThat(randomNumbersGenerator.generate()).isEqualTo(List.of(1,3,5));
                },
                1, 3, 5
        );
    }
}