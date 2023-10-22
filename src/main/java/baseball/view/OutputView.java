package baseball.view;

public class OutputView {
	
	
	// OUTPUT
	public void printStartMessage() {
		System.out.println("숫자 야구 게임을 시작합니다.");
	}
	
	public void printInputMessage() {
		System.out.print("숫자를 입력해주세요 : ");
	}
	
	public void printInputMessage(String input) {
		System.out.println(input);
	}
	
	public void printResultMessage(String result) {
		System.out.println(result);
	}
	
	public void printGameEndMessage(int maxDigit) {
		System.out.println("" + maxDigit + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}
	
	public void printContinueOrQuitMessage(String continueInput, String quitInput) {
		System.out.println("게임을 새로 시작하려면 "+continueInput+",종료하려면 "+quitInput+"를 입력하세요.");
	}
	
	public void printContinueOrQuitMessage(String input) {
		System.out.println(input);
	}
	
	public void printQuitMessage() {
		System.out.println("게임을 종료합니다");
	}
	
}
