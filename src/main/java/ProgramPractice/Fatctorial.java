package  ProgramPractice;

public class Fatctorial {

	
	public static void fact(int i) {
		int num=1;
		for (int j = 1; j <= i; j++) {
			num=num*j;
		}
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		fact(5);
	}
}
