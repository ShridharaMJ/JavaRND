package  demoInheritanc;

public class singleInheritance2 extends SingleInheritance1{
 /*public singleInheritance2() {
	super(10);
}*/




	
	public static int k=90;
	public int y=80;
	
	public singleInheritance2(int i) {
		// TODO Auto-generated constructor stub
		super(i);
	}

	public void method1a() {
		System.out.println("This is the public method od the 2 class");
	}
	
	private void method2a() {
		System.out.println("This provate method of the the 2 class");
	}
	
	
}
