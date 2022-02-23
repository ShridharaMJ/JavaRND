package  ProgramPractice;

public class Prime1 {

	public static boolean isPrime(int n) {
		
		if(n==1) {
			return true;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		boolean xxx = isPrime(1192);
		System.out.println(xxx);
	}
}
