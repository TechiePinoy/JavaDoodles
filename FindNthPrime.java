import java.util.Scanner;

/* This a rudimentary program that 
 * looks for the nth prime number
 * with user's choice of n > 0. 
 * 
 * Current version is works reasonably 
 * fast for up to n = ~100,000 on my PC.
 * 
 * @author: Facebook.com/TechiePinoy
 * 
 * Future versions (if ever) should include:
 * 1. Exception handling (for non-natural number inputs)
 * 2. A better algorithm to minimize bit complexity.
 */

public class FindNthPrime {

	public static void main(String[] args) {
	
		System.out.println("This prog looks for nth prime.");
		System.out.println("Input n (n > 0):");
		
		Scanner z = new Scanner(System.in);
		
		int n = z.nextInt(); // user enters desired n

		z.close();
	
		if ( n < 3 ) {
			if (n == 1 ) {
				System.out.println();
				System.out.println ("Prime no. 1 = 2");
				System.out.println();	
			} else {
				System.out.println();
				System.out.println ("Prime no. 2 = 3");
				System.out.println();	
			}
			
		} else { // for n > 1
			
			int forTest = 3;
			int pCount = 2;
			int mod;
			int div = 3;
			
			while (pCount < n) {
				
				forTest = forTest + 2; //tests next number
				
				while (div < forTest || div == 3) {
					
					mod = forTest % div; // tests divisibility, preps next divisor
					
					if (mod == 0) { // if divisible
						div = 3; // resets div for next candidate
						break; // ends test for current candidate
					} else {
						if (div > (forTest/2)) {
							pCount = pCount + 1;
							div = 3; // resets div in prep for next candidate
							break; // ends test for current candidate
						} else {
							div = div + 2;
						}
					}
				}
				
			}
		System.out.println();
		System.out.println ("Prime no. " + n + " = " + forTest);
		System.out.println();			
		}
	}
}
