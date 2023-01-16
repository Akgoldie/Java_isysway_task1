package isysway_program_stage_1;

public class _39_pattern {
	public static void main(String args []) {

		int i,j;
		for (i=1; i<=5; i++) {
			
			if(i%2==0) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			}
			else {
				for (j=1; j<=i; j++) {
					System.out.print("#");
				}
				
			}
			System.out.println("");
		}
	}

}

/*
		#
        **
        # # #
        ****
        # # # # #       

*/