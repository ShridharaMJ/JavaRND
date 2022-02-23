package  ProgramPractice;

public class PrintPrimeNubmber {

	
	public static void primeInRange(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 2; j <=i; j++) {
				if(i==j) {
					System.out.println(i);
				}
				
				if(i%j==0) {
				break;
				
				}
			}
		}
	}
	
	public static void main(String[] args) {
		primeInRange(100);
	}
}
