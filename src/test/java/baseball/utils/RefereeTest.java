package baseball.utils;

import baseball.commonRules.ContinueRules;
import baseball.domain.BaseballNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    @DisplayName("1")
    @Test
    void equals() {
        assertThat(Referee.equals(BaseballNumbers.createByIntegerList(List.of(1, 2, 3)), BaseballNumbers.createByIntegerList(List.of(1, 2, 3)))).isTrue();
    }

    @DisplayName("1")
    @Test
    void continues() {
        String userIntention = "1";
        assertThat(Referee.continues(userIntention)).isTrue();
    }
}