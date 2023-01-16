package isysway_program_stage_1;

import java.util.Scanner;

public class _40_To_find_odd_or_even {
	public static void main (String args []) {
		int number;
		Scanner num = new Scanner (System.in);
		System.out.print("Enter the number: ");
		number =num.nextInt();
		num.close();
		
		if (number%2==0) {
			System.out.println(number+" is Even number");
		}
		else if (number==0) {
			System.out.println(number+" is Zero");
		}
		else {
			System.out.println(number+" is odd number");
		}
		
	}

}
