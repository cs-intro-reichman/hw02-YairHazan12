/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int current = 0;
		int next = (int)(10*Math.random());
		do {System.out.println(next);
			current = next;
			next = (int)(10*Math.random());
		} while (next>=current);
		
	}
}
