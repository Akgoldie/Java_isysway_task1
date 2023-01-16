package isysway_program_stage_1;

import java.util.Scanner;

public class _72_find_the_sum_of_digits {
	public static void main(String args []) {
		int number,i,digits,sum=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=num.nextInt();
		num.close();
		i=number;
		
		while(i>0) {
			digits=i%10;
			sum+=digits;
			i/=10;
		}
		System.out.println("Sum of digits: "+sum);
	}

}
