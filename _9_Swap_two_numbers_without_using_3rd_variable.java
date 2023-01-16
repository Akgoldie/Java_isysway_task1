package isysway_program_stage_1;

import java.util.Scanner;

public class _9_Swap_two_numbers_without_using_3rd_variable {
	public static void main (String args []) {
		int a,b;
		Scanner num=new Scanner (System.in);
		System.out.print("Enter the A number: ");
		a=num.nextInt();
		System.out.print("Enter the B number: ");
		b=num.nextInt();
		num.close();
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After swapping");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
	}

}
