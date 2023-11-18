package baseball.utils;

import baseball.ui.OutputView;

public class RetryUtils {

    public static void retry(InputFunction inputFunction) {
        boolean validInput = false;
        while(!validInput) {
            try {
                inputFunction.performInput();
                validInput = true;
            } catch(IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
