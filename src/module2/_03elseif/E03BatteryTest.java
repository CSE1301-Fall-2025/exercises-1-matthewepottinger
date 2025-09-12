package module2._03elseif;

public class E03BatteryTest {

	//Exercise 3: Finish this program so that it prints out
	//"plug in your phone!" if the battery is below 50,
	//"unplug your phone!" if it is above 100,
	//and "All okay!" otherwise. Test all three situations.
	public static void main(String[] args) {
		int battery = 130;
		if (battery < 50) {
			System.out.println("plug in your phone!");
		}
		else if (battery > 100) {
			System.out.println("unplug your phone!");
		}
		else {
			System.out.println("All okay!");
		}
		
	}
}
