package  ProgramPractice;

public class FindMissingNo {

	public static int missedNo(int[] a1) {
	int count=a1.length+1;
	//System.out.println(count);
	int expected_result=count*((count+1))/2;
	int actual_result=0;
	for (int i : a1) {
		actual_result=actual_result+i;
	}
	
	return expected_result-actual_result;
	
	}
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16};
		int no = missedNo(array);
		System.out.println(no);
		
	}
}
