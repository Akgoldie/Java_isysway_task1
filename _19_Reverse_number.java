package isysway_program_stage_1;

import java.util.Scanner;

public class _19_Reverse_number {
	public static void main (String args []) {
		int number,i,digits;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=num.nextInt();
		num.close();
		i=number;
		
		while(i>0) {
			digits=i%10;
			System.out.print(digits);
			i/=10;
		}
		
	}

}
