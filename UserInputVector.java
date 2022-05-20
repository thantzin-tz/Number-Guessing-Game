import java.util.Scanner;
import java.util.Vector;

public class UserInputVector {

	Vector<Integer> userVector = new Vector<>();

	public UserInputVector() {

	}

	public Vector<Integer> userInput() {
		if (userVector.size() != 0) {
			userVector.clear();
		}

		Scanner sc = new Scanner(System.in);

		String inputStr;
		System.out.print("Enter Number: ");
		inputStr = sc.nextLine();

		if (inputStr.length() == 4) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < i; j++) {
					while (inputStr.charAt(i) == inputStr.charAt(j)) {
						System.out.println("Duplicate!!");
						System.out.print("Enter another numbers : ");
						inputStr = sc.nextLine();
						j = 0;
					}
				}
			}
		} else {
			System.out.println("Please, Enter only 4 digits!");
			return userInput();
		}

		if (!inputStr.contains(" ")) {
			for (int k = 0; k < inputStr.length(); k++) {
				String num = Character.toString(inputStr.charAt(k));

				try {
					userVector.addElement(Integer.parseInt(num));
				} catch (NumberFormatException e) {
					System.out.println("Please, enter NUMBER only!!");
					return userInput();
				}
			}
		} else {
			System.out.println("Enter number without SPACE!");
			return userInput();
		}
		
		return userVector;
	}
}
