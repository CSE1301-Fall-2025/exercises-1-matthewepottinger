package module2._03elseif;

public class E01TestElseIf {
	//Exercise 1: Try changing the value of x so that you see
	//all three outcomes
	public static void main(String[] args) {
		int x = -9;
		if (x < 0) {
			System.out.println("x is negative");
		}
		else if (x == 0) {
			System.out.println("x is 0");
		}
		else {
			System.out.println("x is positive");
		}
		System.out.println("after conditional");
	}
}
