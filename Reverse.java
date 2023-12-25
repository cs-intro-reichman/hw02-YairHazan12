/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		char middle = ' ';
		for ( int i = 0; i<word.length(); i++){
			System.out.print(word.charAt(word.length() - i - 1));
			if (i == (word.length() + 1) / 2) {
				middle = word.charAt(i);
			}
		}
		System.out.println();
		System.out.print("The middle character is " + middle);
	}
}
