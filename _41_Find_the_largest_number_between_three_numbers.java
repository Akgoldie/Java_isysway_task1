package isysway_program_stage_1;

import java.util.Scanner;

public class _41_Find_the_largest_number_between_three_numbers {
	public static void main (String args []) {
		int number_1,number_2,number_3;
		Scanner num = new Scanner (System.in);
		System.out.print("Enter the first number: ");
		number_1 =num.nextInt();
		System.out.print("Enter the second number: ");
		number_2 =num.nextInt();
		System.out.print("Enter the third number: ");
		number_3 =num.nextInt();
		num.close();
		
		if (number_1>number_2 && number_1>number_3) {
			System.out.println(number_1+" is greatest number");
		}
		else if (number_2>number_1 && number_2>number_3) {
			System.out.println(number_2+" is greatest number");
		}
		else if (number_3>number_1 && number_3>number_2) {
			System.out.println(number_3+" is greatest number");
		}
		
	}


}
