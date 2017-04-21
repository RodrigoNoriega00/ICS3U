/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**Reverse
 * Reverses a sentence
 * 07/04/
 * 2017
 * @author 323995084
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");

		String[] phrase = sc.nextLine().split(" ");
		for(int i=0; i<phrase.length; i++){
			for(int counter=phrase[i].length()-1;counter>=0;counter--){
				//if(phrase[i].charAt(counter) == '.' ){
					System.out.print(phrase[i].charAt(counter)+" ");
				//}
			}
		
		}

	}

}
