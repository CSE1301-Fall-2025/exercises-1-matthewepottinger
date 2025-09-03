package module1._4compound;

public class E01ShortcutOperators {
	
	//Exericse 1: Run the code to see what the ++ and 
	//shorcut operators do. Use the debugger to trace 
	//through the code and observe how the variable values 
	//change.
	public static void main(String[] args) {
		int score = 0;
		System.out.println(score);
		score++;
		System.out.println(score);
		score *= 15;
		System.out.println(score);
		int penalty = 5;
		score -= penalty/2;
		System.out.println(score);
	}
}
