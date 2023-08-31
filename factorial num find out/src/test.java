/**
 * 
 */

/**
 * @author Dell
 *
 */
import java.util.Scanner;
public class test {
		private static Scanner scn;

		public static void main(String[] args){
		scn = new Scanner(System.in);
		System.out.println("Enter Number:" );
		int limit= scn.nextInt();
		int factorial=1;
		
		for(int number=limit; number>0; number--){
		factorial = factorial*number;
		
				}
		System.out.println(factorial);
		}
		
}