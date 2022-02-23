package  demo;

public  class Vararg {

	
	public static int sum(int... x) {
		int sum=0;
		
		for (int i : x) {
			sum=sum+i;
		}
		
		return sum;
	}
	
	
	//public abstract void getString(String...x,int...b) 
	
	
		
	//public static void getString(String...x,int b) 
	
	
	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(sum(10,20));
		System.out.println(sum(10,90,78));
		System.out.println(sum(10,-98));
		System.out.println(sum(10,'a'));
		System.out.println(sum(10,87988));
		
	
	}
}
