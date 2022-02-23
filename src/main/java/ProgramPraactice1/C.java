package  ProgramPraactice1;

import  A;

public class C extends A {

	/*void sample(A a) {
		System.out.println("Sample method");
		a.test1();
	}*/
	
public C(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	
	
	A aref=new A();
	
	C cref=new C();
	cref.methodOne();
	
	A acref1=new C();
	
}
	
}
