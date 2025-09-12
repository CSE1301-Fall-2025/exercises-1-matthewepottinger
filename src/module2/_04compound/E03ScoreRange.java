package module2._04compound;

public class E03ScoreRange {
	
	//Exercise 3: Try different values to see how this code works.
	public static void main(String[] args) {
		int score = 1010; // Try -10 and 110
		if (score < 0 || score > 100) {
			System.out.println("Score has an illegal value.");
		}
		if (score >= 0 && score <= 100) {
			System.out.println("Score is in the range 0-100");
		}
	}
}
