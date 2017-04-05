/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**SumOfDigits
 * Finds the sum of all digits in a number
 * 03/04/2017
 * @author Rodrigo Noriega
 *
 */
public class DigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		System.out.print("Enter a number");
		int x=scan.nextInt();
		int total= digitsSum (x);
		System.out.print(total);
	}
	public static int digitsSum(int x) {
		int total=0;
		while (x>0){
			total=total+x%10;
			x=x/10;
		}
		return total;
	}
		
	}



