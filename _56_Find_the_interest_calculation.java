package isysway_program_stage_1;

import java.util.Scanner;

public class _56_Find_the_interest_calculation {
	public static void main(String args []) {
		
		double principal,rate_of_interest,interval,interest;
		Scanner num =new Scanner (System.in);
		System.out.print("Enter the principal: ");
		principal=num.nextDouble();
		System.out.print("Enter the rate of interest: ");
		rate_of_interest=num.nextDouble();
		System.out.print("Enter the interval: ");
		interval=num.nextDouble();
		num.close();

		interest=(principal*rate_of_interest*interval)/100;
		System.out.print("Interest: "+interest);
		
	}
}
