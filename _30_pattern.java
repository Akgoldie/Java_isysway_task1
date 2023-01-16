package isysway_program_stage_1;

public class _30_pattern {
	public static void main(String args []) {

		int i,j,num;
		for (i=5; i>=1; i--) {
			num=5;
			for (j=1; j<=i; j++) {
				System.out.print(num);
				num-=1;

			}
			System.out.println("");
		}
	}

}

/*
  	   54321
       5432
       543
       54
       5
*/
