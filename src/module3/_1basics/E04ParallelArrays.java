package module3._1basics;

public class E04ParallelArrays {
	
	//Exercise 4: Can you print out Mateo's score?
	//Can you change Sofia's score to 97 using an assignment statement in the code? 
	//Can you change the arrays so that they have 6 elements and add your name and score and print them out? 
	public static void main(String[] args) {
		// declare, create, initialize arrays
		int[ ] highScores = {99,98,98,88,68};
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
		highScores[4] = 97;

		// Print corresponding names and scores
		System.out.println(names[3] + " has a score of " + highScores[3]);
		System.out.println(names[4] + " has a score of " + highScores[4]);
	}
}

