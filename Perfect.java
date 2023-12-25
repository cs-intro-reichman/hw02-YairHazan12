/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 1; i < x ; i++){
			if (x % i == 0)
				sum += i;
		}
		
		if (sum == x) {
			System.out.print(x + " is a perfect number since " + x + " = ");
			for (int i = 1; i <= x/2 ; i++){
				if (x % i == 0){
					System.out.print(i);
					if (x/2 != i) 
						System.out.print(" + ");
				}
				
			}
		}else{
			System.out.println(x + " is not a perfect number");
		}
	}
}
