package baseball.domain.count;

import baseball.domain.BaseballNumber;

import java.util.List;

public interface Counter {
    int calculate(List<BaseballNumber> computerNumbers, List<BaseballNumber> userNumbers);
}
