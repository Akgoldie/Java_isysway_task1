package isysway_program_stage_1;

import java.util.Scanner;

public class _77_program_to_check_leap_year_or_not {
	public static void main (String args []) {
		int year;
		Scanner num = new Scanner (System.in);
		System.out.print("Enter the year: ");
		year =num.nextInt();
		num.close();
		
		if (year%4==0) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		
	}

}
