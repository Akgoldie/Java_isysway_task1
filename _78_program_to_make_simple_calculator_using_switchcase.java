package isysway_program_stage_1;

import java.util.Scanner;

public class _78_program_to_make_simple_calculator_using_switchcase {
	public static void main (String args[]) {
		char operator;
		int first,second;
		Scanner ch = new Scanner (System.in);
		System.out.print("Enter the operator: ");
		operator=ch.next().charAt(0);
		
		System.out.print("Enter the first number: ");
		first=ch.nextInt();
		
		System.out.print("Enter the second number: ");
		second=ch.nextInt();
		
		ch.close();
		switch(operator)
		{
		case '+':
			System.out.println("Addition of two numbers: "+(first+second));
			break;
		case '-':
			System.out.println("Subtraction of two numbers: "+(first-second));
			break;
		case '*':
			System.out.println("Multiplication of two numbers: "+(first*second));
			break;
		case '/':
			System.out.println("Division of two numbers: "+(first/second));
			break;
		case '%':
			System.out.println("Modulus of two numbers: "+(first%second));
			break;
			
		default:
			System.out.println("Invalid input");
		}
	}

}
