package module3._4twodimensional;

public class E03TwoDArrayInitGet {
	//Exercise 3: Add another row with your name and a friend's name.
	//Get these names out with the correct indices and print them
	public static void main(String[] args) {
		String[][] seatingInfo = { {"Jamal", "Maria"},
				{"Jake", "Suzy"},
				{"Emma", "Luke"},
				{"Matthew", "Margo"} };
		String name = seatingInfo[3][1];
		System.out.println(name + " is at [3,1]");

	}
}

