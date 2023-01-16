package isysway_program_stage_1;

public class _61_Count_total_number_of_even_and_odd_numbers_in_the_array {
	public static void main(String args []) {
		int array[]= {2,1,43,5,67,44,88,77,11,3};
		int i,odd_count=0,even_count=0;
		for (i=0; i<array.length;i++) {
			if (array[i]%2==0) {
				even_count+=1;
			}
			else {
				odd_count+=1;
			}
			
		}
		System.out.println("Count of even numbers: "+even_count);
		System.out.println("Count of odd numbers: "+odd_count);
	}

}
