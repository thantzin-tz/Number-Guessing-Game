import java.util.Random;
import java.util.Vector;

public class RandomGenerateVector {
	Vector<Integer> randomVector = new Vector<>();
	public RandomGenerateVector() {
		
	}
	public Vector<Integer> machine(){
		Random random = new Random();
		for(int i = 0; i < 4; i++) {
			int a = random.nextInt(1,10);
			randomVector.addElement(a);
			for(int j = 0; j<i; j++) {
				if(randomVector.get(i) == randomVector.get(j)) {
					int b = random.nextInt(1,10);
					randomVector.setElementAt(b, i);
					j = 0;
				}
			}
		}
		System.out.println("Random Vector : "+randomVector);
		return randomVector;
	}
}
