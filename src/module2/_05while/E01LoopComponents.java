package module2._05while;

public class E01LoopComponents {
	
	//Exercise 1: Use the debugger to walk through this program.
	//Can you change it to count from 2 to 10?
	public static void main(String[] args) {
		// 1. initialize the loop variable
		int count = 2;

		// 2. test the loop variable
		while (count >= 2 && count <= 10) {
			System.out.println(count);
			// 3. change the loop variable
			count++;
		}
		System.out.println("test");

	}
}

