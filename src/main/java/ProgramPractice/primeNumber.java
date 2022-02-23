package  ProgramPractice;

public class primeNumber {

	public static void isPrime(int num) {
		int count=0;
		if(num==0) {
			System.out.println(num + " is not prime number");
		}
		else if(num==1|num==2) {
			System.out.println(num + " is Prime number");
		}
		else 
		{
			for (int i =2; i <=num; i++) {
				if(num%i==0) {
					count++;
				}
			}
			
			if(count>1)
				System.out.println(num +" is not a prime number");
			else
				System.out.println(num +" is prime number");
		}
	}
	public static void main(String[] args) {
		primeNumber.isPrime(97);
	}
}
