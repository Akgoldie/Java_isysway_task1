package isysway_program_stage_1;

import java.util.Scanner;

public class _53_Print_the_square_number_series {
	public static void main(String args []) {
		int i,last;
		Scanner num =new Scanner (System.in);
		System.out.print("Enter the last number: ");
		last=num.nextInt();
		num.close();
		
		for (i=1; i<=last; i++) {
			System.out.println(i*i);
		}
	}

}
