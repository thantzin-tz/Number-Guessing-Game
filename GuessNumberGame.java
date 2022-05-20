import java.io.IOException;
import java.util.Vector;

public class GuessNumberGame {

	public static void main(String[] args) throws IOException {
		RandomGenerateVector randomV = new RandomGenerateVector();
		Vector<Integer> vector = randomV.machine();

		UserInputVector userV = new UserInputVector();
		userV.userInput();

		boolean gameOver = CheckMatch.playGame(randomV.randomVector, userV.userVector);
		char c;
		while (gameOver) {
			System.out.println("Do you want to play again??");
			System.out.print("Plsease Enter (y/n) : ");
			c = (char) System.in.read();
			switch (c) {
			case 'y':
				vector.removeAllElements();
				randomV.machine();
				userV.userInput();
				gameOver = CheckMatch.playGame(randomV.randomVector, userV.userVector);
				break;
			case 'n':
				System.out.println("!!! Game is end !!!");
				gameOver = true;
				break;
			default:
				System.out.println("!!! Game is end !!!");
				gameOver = true;
				break;
			}
		}

	}

}
