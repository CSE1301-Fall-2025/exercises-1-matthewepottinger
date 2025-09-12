package module2._06for;

public class E02ForLoopFromWhile {

	//Exercise 2: Write a for loop that works exactly the same
	//as the given while loop
	public static void main(String[] args) {
		int count = 5;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		for (int ct = 5; ct <= 10; ct++){
			System.out.println(ct);
		}
	}
}
