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
		int[] array=new int [4];
		System.out.print("Enter 4 numbers");
		array[0]=scan.nextInt();
		array[1]=scan.nextInt();
		array[2]=scan.nextInt();
		array[3]=scan.nextInt();
		int num=scan.nextInt();
		int bigN= largeN(array);
		System.out.println(bigN);
		
		}
	public static int largeN (int[] array){
		int largestN=array[0];
		for (int i=1;i<array.length;i++){
			if(array[i]>array[largestN]){
				largestN=i;
			}
		}
		return largestN;
	}
		

}
