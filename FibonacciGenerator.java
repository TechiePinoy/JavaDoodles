import java.util.Scanner;

/* This lists the 1st to nth fibonacci numbers.  
 * This version holds for up to n = 92, 
 * owing to limitations for long data type. 
 * Program rejects n > 92, requires new input. 
 * 
 * @author: TechiePinoy
 * facebook.com/TechiePinoy
 */

public class FibonacciGenerator {

	public static void main(String[] args) {
			
			System.out.println("This prog looks for nth fibonacci number.");
			System.out.println("Input n ( 93 > n > 0):");
			
			Scanner z = new Scanner(System.in);
			
			int n = z.nextInt(); // user enters desired n
			
								
			int i = 3; // index
			long f = 1; // starts at 2nd fibonacci number 1
			long g1 = 1; // dummy variable representing (n-1)th fibonacci number
			long g2 = 1; // dummy variable representing (n-2)th fibonacci number
		
					
				// requires n to be between 0 and 93		
				while (n > 92) {
					System.out.println("Error. Try again.");
					System.out.println("Input n, where 93 > n > 0:");
					System.out.println();
					n = z.nextInt();
								
				} 
				
			z.close();
			
					if (n < 3) {
						System.out.println("nth Fibonacci number at n = 1 is 1"); 
						System.out.println("nth Fibonacci number at n = 2 is 1");
						System.out.println("-END OF LIST-"); 
						
					} else {
						
					// iteration phase, each iteration prints ith fibonacci number until i = n. 
					while (i <= n) {
						f = g1 + g2; // gets ith fibonacci number
						g2 = g1; // replaces g2 with g1 for next iteration
						g1 = f; // replaces g1 with f for next iteration
						
						System.out.println("nth Fibonacci number at n = " + i + " is " + f);
						
						i = i + 1; // index
				
					}	
					
					System.out.println("-END OF LIST-"); 
			}
	}
}
