package  ProgramPractice;

public class SumOfFactor {
public static int sumOfFactorOfNum(int num) {
	int f_sum=0;
	
	for (int i = 1; i <=num; i++) {
		if(num%i==0) {
			f_sum=f_sum+i;
		}
		
	}
	
	return f_sum;
}


public static void main(String[] args) {
	
int xx = sumOfFactorOfNum(36);
System.out.println(xx);

}
}
