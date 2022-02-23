package  ProgramPractice;

public class Armstrong {

	
	public static void isArm(int n) {
		int a=n,r=0,s=0;
		
		while(a!=0) {
			r=a%10;
			a=a/10;
			s=s+r*r*r;
			
		}
		
		if(s==n) {
			System.out.println("Given Number is  a Armstring Number");
		}
		else
		{
			System.out.println("Given Number is not a Armstring Number");	
		}
	}
	
	public static void main(String[] args) {
		isArm(333);
	}
}
