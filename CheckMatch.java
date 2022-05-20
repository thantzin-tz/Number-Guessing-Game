import java.util.Vector;

public class CheckMatch {
	public CheckMatch() {
	}

	public static int checkHit(Vector<Integer> randomV, Vector<Integer> userV) {
		int h = 0, b = 0;
		for (int i = 0; i < randomV.size(); i++) {
			for (int j = 0; j < userV.size(); j++) {
				if (randomV.get(i) == userV.get(j) && i == j) {
					h++;
				} else if (randomV.get(i) == userV.get(j)) {
					b++;
				}
			}
		}
		System.out.println();
		System.out.println("Hit : " + h + "\tBlow : " + b);

		return h;
	}

	public static boolean playGame(Vector<Integer> r, Vector<Integer> u) {
		UserInputVector user = new UserInputVector();
		int hit = checkHit(r, u);
		int count = 1;
		boolean gameOver = false;

		while (hit != 4 && count != 3) {
			System.out.println("========= Round : " + count + " ==========");
			System.out.println("User Vector : " + u);
			System.out.println("Your number is INCORRECT! Try again!");
			u = user.userInput();
			hit = checkHit(r, u);
			count++;
		}
		if(count == 3 && hit != 4) {
			System.out.println("========= Round : " + count + " ==========");
			System.out.println("Does not Match! Try again.");
			System.out.println("User Vector : " + u);
			System.out.println("-------------x-------------");
			System.out.println("XXX Game Over XXX");
			System.out.println("!!! You have tried 3 times !!!");
			System.out.println("-------------x-------------");
			gameOver = true;
		}
		
		if(hit == 4) {
			System.out.println("Random Vector : "+r);
			System.out.println("User Vector : "+u);
			System.out.println("-------------x-------------");
			System.out.println("\tYou Win!!");
			System.out.println("-------------x-------------");
		}
		return gameOver;
	}
}
