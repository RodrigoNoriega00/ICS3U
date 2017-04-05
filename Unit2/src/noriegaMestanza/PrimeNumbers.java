/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**
 * @author Rodrigo Noriega
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {
	//public static boolean main(boolean value) {
		
		Scanner scan=new Scanner (System.in);
		int x=0;
		do{
		System.out.println("Enter a number.");
		int num= scan.nextInt();
			if(primeNum(num)){
				System.out.println(num+" is prime");
			}
			else{System.out.println(num+" is not prime");
			}
			}while(x==0);
	}
	public static boolean primeNum(int x){
	
		for(int i=2;i<x;i++){
			if(x % i==0){
				return false;
			}
		}
			return true;
			}
		}
				

	

