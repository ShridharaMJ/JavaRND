package  ProgramPractice;

public class CircularPrime {

	public static int circular(int a) {
		String str=Integer.toString(a);
		str=str.substring(1)+str.charAt(0);
		a=Integer.parseInt(str);
		return a;
	}
	
	public static boolean isCircularPrime(int a) {
		
		int n=a;
		do {
			if(Prime1.isPrime(a)==false) {
				return false;
			}
			a=circular(a);	
		}while(a!=n);
		
		return true;
		
		
	}
	public static void main(String[] args) {
	boolean a=isCircularPrime(1192);
		System.out.println(a);
	}
}
