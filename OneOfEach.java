
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		String gender = "";
		String newborn = "";
		int babycounter = 1;
		double borg = Math.random(); // boy or girl
		if (borg < 0.5) 
			gender = "b ";
		else
			gender = "g ";
		System.out.print(gender);
		do {babycounter++;
			borg = Math.random();
			if (borg < 0.5) 
				newborn = "b ";
			else
				newborn = "g ";
			System.out.print(newborn);
		} while (gender == newborn);
		System.out.println();
		System.out.println("You made it... and you now have " + babycounter + " children.");
	}
}
