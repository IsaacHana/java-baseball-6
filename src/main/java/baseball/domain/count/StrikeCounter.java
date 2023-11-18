package baseball.domain.count;

import baseball.domain.BaseballNumber;

import java.util.List;

public class StrikeCounter implements Counter {

    @Override
    public int calculate(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers) {
        int strike = 0;
        for (int i = 0; i < computerNumbers.size(); i++) {
            if (computerNumbers.get(i).equals(userNumbers.get(i))) {
                strike += 1;
            }
        }
        return Math.max(0, strike);
    }
}
