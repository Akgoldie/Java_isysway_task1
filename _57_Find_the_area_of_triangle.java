package isysway_program_stage_1;

import java.util.Scanner;

public class _57_Find_the_area_of_triangle {
	public static void main(String args []) {
		
		double base,height,area;
		Scanner num =new Scanner (System.in);
		System.out.print("Enter the base: ");
		base=num.nextDouble();
		System.out.print("Enter the height: ");
		height=num.nextDouble();
		
		num.close();

		area=0.5*base*height;
		System.out.print("Area of triangle: "+area);
		
	}


}
