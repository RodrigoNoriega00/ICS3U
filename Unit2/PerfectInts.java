/**
 * 
 */
package noriegaMestanza;
import java.util.Scanner;

/**Rodrigo Noriega
 * Finds out if a number is a perfect integer
 * 19/04/2017
 * @author 323995084
 *
 */
public class PerfectInts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The following are perfect numbers from 1 to 1000");
		for(int count= 1; count<= 1000; count++){
			if (perfect(count)){
				System.out.println(count);
			}
		}

	}
	public static boolean perfect(int n) {

		int total=0;
		for(int i =n-1; i>0; i--){
			if (n%i==0){
				total=total+i ;
			}
		}
			

			if (total==n){
				return true;
			}
		return false;
	}
}



