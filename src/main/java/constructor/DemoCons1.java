package  constructor;

public class DemoCons1 {
	int num1;
	int num2;
	int sum;
	
	public DemoCons1(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		System.out.println(total());
			}
	
	
	
	public int total() {
		return sum=num1+num2;
	}

	
	public static void main(String[] args) {
		new DemoCons1(100,200);
		new DemoCons1(1001,2001);
		
	}
}
