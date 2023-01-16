package isysway_program_stage_1;

public class _63_Reverse_the_string {
	public static void main (String args []) {
		String string;
		string="arun kumar";
		int length =string.length();
		for (int i=length-1; i>=0; i--) {
			System.out.print(string.charAt(i));
		}
		
		
	}

}
