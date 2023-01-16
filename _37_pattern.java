package isysway_program_stage_1;

import java.util.Scanner;

public class _37_pattern {
	public static void main (String args []) {
		int i,j,n;
		Scanner num =new Scanner(System.in);
		System.out.print("Enter the limit: ");
		n=num.nextInt();
		for (i=1; i<=n; i++) {
			for (j=1; j<=n; j++) {
				if (i==1 || i==n) {
					System.out.print("* ");
				}
				else {
					if(j==1 || j==n) {
						System.out.print("* ");
						
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println("");
		}
	}
}

/*
)          *  *  *  *  *
           *           *
           *           *
           *           *
           *  *  *  *  *
*/