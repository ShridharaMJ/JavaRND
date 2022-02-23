package artimaticsoperators;

public class IncrementDecrement {
public static void main(String[] args) {
	
//-------------------------------------------------------	
	int x=10;
	
	//int y=++x;
	
	int y=x++;
	
	System.out.println(y+" "+x);
	
//--------------------------------------------------------	
	
	int a=10;
	
	//int b=--a;
	
	int b=a--;
	
	System.out.println(b+" "+a);
	
//--------------------------------------------------------
	int m=10;
	
//	int n=++10; compile time error
	
//--------------------------------------------------------
	
	int s=10;
	
	//int p=++(++s); It will become constant
	
//--------------------------------------------------------
	
	final int d=10;
	
	//int f=d++;  Final value cann't increment
	
//---------Increment and Decrement operation on any primitive data type except boolean
	
	int k=10;
	k++;
	System.out.println("K="+k);
	
	char temp='a';
temp++;
	
	System.out.println("temp="+temp);
	
	double db=10.9;
	db++;
	System.out.println("Db="+db);
	
	boolean boo=true;
	// boo++; Compile time error
	
	
}
}
