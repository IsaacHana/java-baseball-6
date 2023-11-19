package baseball.controller;

import baseball.domain.Computer;
import baseball.ui.InputView;
import baseball.ui.OutputView;
import baseball.utils.NumbersGenerator;
import baseball.utils.Referee;
import baseball.domain.User;
import baseball.utils.RandomNumbersGenerator;
import baseball.utils.RetryUtils;

public class BaseballGame {
    static {
        OutputView.printGameStartMessage();
    }

    private final NumbersGenerator numbersGenerator = new RandomNumbersGenerator();

    private Computer computer;
    private User user;
    private Referee referee;

    private boolean continueGame;

    public void run() {
        do {
            createComputerNumbers();
            playGame();
            gameContinues();
        } while (continueGame);
    }

    private void createComputerNumbers() {
        computer = Computer.createWithRandomNumbers(numbersGenerator);
    }

    private void gameContinues() {
        RetryUtils.retry(() -> continueGame = Referee.continues(InputView.getUserIntention()));
    }

    private void playGame() {
        do {
            collectUserNumbers();
            calculateResult();
            announceResult();
        } while (!Referee.equals(computer.getNumbers(), user.getNumbers()));
        printWinning();
    }

    private void collectUserNumbers() {
        RetryUtils.retry(() -> user = User.valueOf(InputView.getUserNumbers()));
    }

    private void calculateResult() {
        referee = Referee.calculateResult(computer.getNumbers(), user.getNumbers());
    }

    private void announceResult() {
        OutputView.printResult(referee);
    }

    private void printWinning() {
        OutputView.printWinningMessage();
    }
}
