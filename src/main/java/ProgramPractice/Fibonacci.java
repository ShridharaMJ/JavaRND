package  ProgramPractice;

public class Fibonacci {

	public static void fibo(int num) {
		int temp = 0;
		int n3,n1=0;
		int n2=1;
		
		System.out.print(n1+" "+n2);
		
		for (int i = 2; i <10; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
	}
	
	
	public static void main(String[] args) {
		fibo(10);
	}
}
