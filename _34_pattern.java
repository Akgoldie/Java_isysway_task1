package isysway_program_stage_1;

public class _34_pattern {
	public static void main(String args []) {

		int i,j,num=1;
		for (i=1; i<=4; i++) {
			for (j=1; j<=i; j++) {
				System.out.print(num);
				num+=1;

			}
			System.out.println("");
		}
	}

}

/*
		1
        23
        456
        78910
*/