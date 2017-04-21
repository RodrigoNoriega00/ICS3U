/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**Palimdrome
 * 13/04/2017
 * finds Palimdrome
 * @author 323995084
 *
 */
public class Palimdrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to check if its a palimdrome");
		String word = scan.nextLine();
		{
			if (palimdrome(word)==true){
				System.out.println(word+" is a palimdrome");
				}
			else{
				System.out.println(word+" is not a palimdrome");
			}
		}
		}
			
			
			public static boolean palimdrome(String word){
				String s ="";
				for(int i = word.length()-1;i>=0; i--){
					s=s+word.charAt(i);
				}
				if (word.equals(s)){
					return true;
				}
				return false;
				}
		}
