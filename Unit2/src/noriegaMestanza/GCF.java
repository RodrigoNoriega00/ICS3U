/**
 * 
 */
package noriegaMestanza;
import java.util.Scanner;

/** GCF
 * Finds the GCF
 * 04/04/2017
 * @author Rodrigo Noriega
 *
 */
public class GCF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.print("Enter 2 numbers");
		int b=scan.nextInt();
		int a=scan.nextInt();
		int total= gcf (a,b);
		System.out.print(total);
	}
	public static int gcf(int a,int b){
		int big= Math.max(a,b);
		int small=Math.min(a, b);
		for (int i=small;i>0;i--){
			if (big %i==0 && small % i==0){
				return i;
			}
		}
		return 1;
			
		}
		
		
	}


