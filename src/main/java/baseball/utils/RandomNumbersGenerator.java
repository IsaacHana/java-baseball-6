package baseball.utils;

import baseball.commonRules.Rules;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbersGenerator implements NumbersGenerator {
    @Override
    public List<Integer> generate() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < Rules.MAX_SIZE.getValue()) {
            int randomNumber = Randoms.pickNumberInRange(Rules.MIN_NUMBER.getValue(), Rules.MAX_NUMBER.getValue());
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
