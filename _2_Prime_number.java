package isysway_program_stage_1;

import java.util.Scanner;

public class _2_Prime_number {
	public static void main (String args []) {
		int number,i,count=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=num.nextInt();
		num.close();
		
		for (i=1;i<=number;i++) {
			if(number%2==0) {
				count+=1;
				
			}
			
		}
		if(count==2) {
			System.out.println(number+" is prime number");
		}
		else {
			System.out.println(number+" is not a prime number");
		}
	}
	

}
