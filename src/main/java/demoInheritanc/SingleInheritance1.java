package  demoInheritanc;

public class SingleInheritance1 {
	
	public SingleInheritance1() {
		// TODO Auto-generated constructor stub
		System.out.println("Executing the singleInheritance1s default constructor");
	}
	
	public SingleInheritance1(int x) {
		System.out.println("The of x is "+x);
	}
	
	public static int i=100;
	public int j=100;
	public void method1() {
		System.out.println("This is the supper class method");
		
	}
	 private void method2() {
		 System.out.println("This is the provate method of the supper class");
	 }
	
}
