package isysway_program_stage_1;

import java.util.Scanner;

public class _5_Armstrong_number {
	public static void main (String args []) {
		int number,i,number2=0,digits;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=num.nextInt();
		num.close();
		i=number;
		
		while(i>0) {
			digits=i%10;
			number2+=(digits*digits*digits);
			i/=10;
		}
		 if (number==number2) {
			 System.out.println(number+" is armstrong number");
		 }
		 else 
		 {	
			 System.out.println(number+" is not armstrong number");
			 }
			
	}

}
