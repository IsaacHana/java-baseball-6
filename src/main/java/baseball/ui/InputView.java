package baseball.ui;

import baseball.commonRules.ContinueRules;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String getUserNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    public static String getUserIntention() {
        System.out.printf("게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요.%n", ContinueRules.CONTINUE.getValue(), ContinueRules.QUIT.getValue());
        return Console.readLine();
    }
}
