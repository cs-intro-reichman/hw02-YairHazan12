/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double avarage = 0;
		int familiesof2, familiesof3, familiesof4ormore, mostcommon;
		familiesof2 = familiesof3 = familiesof4ormore = mostcommon = 0;
		int T = Integer.parseInt(args[0]);
		for (int i = 0; i < T; i++) {
			String gender = "";
			String newborn = "";
			int babycounter = 1;
			double borg = Math.random(); // boy or girl
			if (borg < 0.5) 
				gender = "b ";
			else
				gender = "g ";
			do {babycounter++;
				borg = Math.random();
				if (borg < 0.5) 
					newborn = "b ";
				else
					newborn = "g ";
			} while (gender == newborn);
			avarage +=babycounter;
			switch (babycounter) {
				case 2:
					familiesof2++;
					break;
				case 3:
					familiesof3++;
					break;
				default:
					familiesof4ormore++;
					break;
			}
		}
		avarage = avarage/T;
		System.out.println("Average: " + avarage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesof2);
		System.out.println("Number of families with 3 children: " + familiesof3);
		System.out.println("Number of families with 4 or more children: " + familiesof4ormore);
		if (familiesof2 == Math.max(familiesof4ormore, Math.max(familiesof2, familiesof3))) {
			System.out.println("The most common number of children is 2.");
		}else if (familiesof3 == Math.max(familiesof4ormore, Math.max(familiesof2, familiesof3))) {
			System.out.println("The most common number of children is 3.");
		}else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
