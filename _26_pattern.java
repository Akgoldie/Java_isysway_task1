package isysway_program_stage_1;

public class _26_pattern {
	public static void main(String args []) {
		
		char i,j;
		for (i='a'; i<='e'; i++) {
			for (j='a'; j<=i; j++) {
				System.out.print(i);	
			}
			System.out.println("");
		}
	}


}

/*
		a
		bb
		ccc
		dddd
		eeeee
*/