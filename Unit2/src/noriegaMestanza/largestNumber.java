/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/** largestNumber
 * finds the largest number
 * 04/04/2017
 * @author Rodrigo Noriega
 *
 */
public class largestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.print("Enter 2 numbers");
		int b=scan.nextInt();
		int a=scan.nextInt();
		int large= largeN (a,b);
		System.out.print(large);
	}
	public static int largeN (int a,int b){
		return Math.max(a,b);
	}

}
