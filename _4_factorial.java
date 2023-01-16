package isysway_program_stage_1;

import java.util.Scanner;

public class _4_factorial {
	public static void main (String args []) {
		int number,i,fact=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=num.nextInt();
		num.close();
		
		for (i=1;i<=number;i++) {
			fact*=i;
					
		}
		System.out.println("Factorial of "+number+" is " +fact);
	}

}
