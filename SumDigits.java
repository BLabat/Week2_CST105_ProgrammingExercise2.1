/** Program: Programming Exercise 2.1
 * File: SumDigits
 * Summary: Finds the sum of a five digit integer
 * Author: Brandon Labat
 * Date: March 2, 2018
 */
import java.util.Scanner;
public class SumDigits {
	public static void main(String[] args) {
		
		int x;
		int first, second, third, fourth, fifth;
			int sum = 0;	
			
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter 5-digit number
		System.out.print("Enter a 5 digit number: ");{
			
			x = input.nextInt();
				first = x % 10;
				x = x / 10;
			sum = sum + first; //fifth digit
				second = x % 10;
				x = x / 10;
			sum = sum + second; // fourth digit
				third = x % 10;
				x = x / 10;
			sum = sum + third; // third digit
				fourth = x % 10;
				x = x /10;
			sum = sum + fourth; // second digit
				fifth = x % 10;
				x = x / 10;
			sum = sum + fifth; // first digit
			
		//Displays results
		System.out.print("The sum of ");
		System.out.print(fifth);
		System.out.print(" + ");
		System.out.print(fourth);
		System.out.print(" + ");
		System.out.print(third);
		System.out.print(" + ");
		System.out.print(second);
		System.out.print(" + ");
		System.out.print(first);
		System.out.print(" is ");
			System.out.print((sum));	
		}
		}
	}
	