/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**Factorial Program
 * Finds the factorial of a number
 * 03/04/2017
 * @author 323995084
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		System.out.print("Enter a number");
		int x = scan.nextInt();
		int fact= factorial (x);
		System.out.print(fact);
		
	}

	public static int factorial(int x) {
		int sum=x;
		for(int i=x-1;i>0;i--){
			sum=sum*i;
		}
		return sum;
	}

}





