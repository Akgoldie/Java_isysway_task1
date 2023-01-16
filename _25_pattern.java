package isysway_program_stage_1;

public class _25_pattern {
	public static void main(String args []) {
		
		char i,j;
		for (i='a'; i<='e'; i++) {
			for (j='a'; j<=i; j++) {
				System.out.print(j);	
			}
			System.out.println("");
		}
	}

}

/*
		a                                                 
        ab
        abc
        abcd
        abcde
*/
