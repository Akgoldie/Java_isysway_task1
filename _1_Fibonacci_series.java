package isysway_program_stage_1;

import java.util.Scanner;

public class _1_Fibonacci_series {
	public static void main (String args []) {
		int number,i,temp1,temp2,fib;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=num.nextInt();
		num.close();
		
		temp1=0;
		temp2=1;
		fib=1;
		for (i=1;i<=number;i++) {
			System.out.println(fib);
			fib=temp1+temp2;
			temp1=temp2;
			temp2=fib;
			
			
		}
		
	}

}
