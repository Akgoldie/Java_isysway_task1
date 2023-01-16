package isysway_program_stage_1;

import java.util.Scanner;

public class _8_Swapping_with_using_3rd_variable {
	public static void main (String args []) {
		int a,b,temp;
		Scanner num=new Scanner (System.in);
		System.out.print("Enter the A number: ");
		a=num.nextInt();
		System.out.print("Enter the B number: ");
		b=num.nextInt();
		num.close();
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
	}

}
