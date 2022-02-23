package artimaticsoperators;

public class ArthimeticOperator {
public static void main(String[] args) {
	
	//Arthimatic operation between two operand
	
	byte b1=10;
	byte b2=45;
	//byte b3=b1+b2; it will give result in int
	
	byte ba1=10;
	//byte ba2=ba11+2;  it will give result in int
	
	//---------------------------
	
	//System.out.println(10/0);    //R.E divided/zero exception

	System.out.println(10/0.0); //result will be "Infinite
	
	System.out.println(-10/0.0); //result will be "-infinite"
	
	
	//System.out.println(0/0); //RE Arthimatic exception
	
	
	System.out.println(0/0.0);  //result will be "Not a Number" i.e. NaN
	
	
	int a=10;
	  a >>=3;
	  
	  System.out.println(a);
	
	
	
	
}
}
