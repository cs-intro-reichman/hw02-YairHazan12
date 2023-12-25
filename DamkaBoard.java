/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		for (int i = 0; i < x; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < x; j++) {
				System.out.print("*");
				System.out.print(" ");
				}
			}else{
				for (int j = 0; j < x; j++) {
					System.out.print(" ");	
					System.out.print("*");
				}
			}
			System.out.println();
		}	
			
	}
}
