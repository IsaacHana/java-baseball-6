package baseball.domain.count;

import baseball.domain.BaseballNumber;

import java.util.List;

public class BallCounter implements Counter {

    @Override
    public int calculate(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers) {
        Counter strikeCounter = new StrikeCounter();

        int ball = 0;
        for (int i = 0; i < computerNumbers.size(); i++) {
            if (computerNumbers.contains(userNumbers.get(i))) {
                ball += 1;
            }
        }

        return Math.max(0, ball - strikeCounter.calculate(computerNumbers, userNumbers));
    }
}
