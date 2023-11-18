package baseball.ui;

import baseball.domain.count.ResultType;
import baseball.utils.Referee;

import java.util.Map;

public class OutputView {
    public static void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    public static void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(Referee referee) {
        Map<ResultType, Integer> gameResult = referee.getGameResult();
        if (gameResult.isEmpty()) {
            System.out.print("낫싱");
        }
        for (ResultType resultType : gameResult.keySet()) {
            System.out.print(gameResult.get(resultType) + resultType.getName() + " ");
        }
        System.out.println();
    }

    public static void printWinningMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
