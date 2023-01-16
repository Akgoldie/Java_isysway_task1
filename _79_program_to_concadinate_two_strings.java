package isysway_program_stage_1;

import java.util.Scanner;

public class _79_program_to_concadinate_two_strings {
	public static void main(String args []){
		String str_1,str_2;
		Scanner string = new Scanner (System.in);
		System.out.print("Enter first string: ");
		str_1=string.nextLine();
		System.out.print("Enter second string: ");
		str_2=string.nextLine();
		string.close();
		
		System.out.println(str_1+str_2);
	}

}
