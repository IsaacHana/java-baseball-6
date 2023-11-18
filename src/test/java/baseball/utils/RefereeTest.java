package baseball.utils;

import baseball.commonRules.ContinueRules;
import baseball.domain.BaseballNumber;
import baseball.domain.BaseballNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    @DisplayName("동등성 테스트")
    @Test
    void equals() {
        List<BaseballNumber> computer = BaseballNumbers.createByIntegerList(List.of(1, 2, 3)).getNumbers();
        List<BaseballNumber> user = BaseballNumbers.createByIntegerList(List.of(1, 2, 3)).getNumbers();
        List<BaseballNumber> user2 = BaseballNumbers.createByIntegerList(List.of(3, 2, 1)).getNumbers();
        assertThat(Referee.equals(computer, user)).isTrue();
        assertThat(Referee.equals(computer, user2)).isFalse();
    }

    @DisplayName("게임 지속 의사 확인 테스트")
    @Test
    void continues() {
        String userIntention = ContinueRules.CONTINUE.getValue();
        assertThat(Referee.continues(userIntention)).isTrue();
    }
}