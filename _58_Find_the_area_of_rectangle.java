package isysway_program_stage_1;

import java.util.Scanner;

public class _58_Find_the_area_of_rectangle {
	public static void main(String args []) {
		
		double breath,length,area;
		Scanner num =new Scanner (System.in);
		System.out.print("Enter the base: ");
		breath=num.nextDouble();
		System.out.print("Enter the height: ");
		length=num.nextDouble();
		
		num.close();

		area=0.5*breath*length;
		System.out.print("Area of rectangle: "+area);
		
	}


}
