package module2._01ifs;

public class E03TestNumbers {
	
	//Exercise 3: Add another if statement to this program to check
	//for negative numbers
	public static void main(String[] args) {
		// Get a random number from -10 up to 10.
		int number = (int) (Math.random()*21 - 10);
		System.out.println("The number is " + number);

		// is it positive?
		if (number > 0) {
			System.out.println(number + " is positive!");
		}
		// is it 0?
		if (number == 0) {
			System.out.println(number + " is zero!");
		}
		// is it negative?
		if (number < 0) {
			System.out.println(number + " is negative!");
		}
	}
}
