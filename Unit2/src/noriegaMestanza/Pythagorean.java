/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**Rodrigo Noriega
 * Finds pythagorean triples from 1 to 99
 * 19/04/2017
 * @author 323995084
 *
 */
public class Pythagorean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("This program will output the possible values of A and B less than 100 to make a pythagorean triple ");

		for(int a = 1; a < 100;a++) {
			for (int b = 1; b<100;b++){
				int c=(int)(Math.pow(a,2)+ Math.pow(b,2));
				if(perfectSq(c)==true){ 
				c=(int)Math.sqrt(c);
					System.out.println(a +" "+ b + " " + c);
				}			
			}
		}
	}
	public static boolean perfectSq(int n){
		int x= (int)Math.sqrt(n);
		double check=Math.pow(x,2);
		if (check==n){
			return true;
	}
	return false;
}
}


