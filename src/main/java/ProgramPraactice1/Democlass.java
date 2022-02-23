package  ProgramPraactice1;



public class Democlass {

	int roll;
	String name;
	public Democlass(int roll,String name) {
		// TODO Auto-generated constructor stub
		this.roll=roll;
		this.name=name;
	}
	static String clg;
	static String principal;
	
	
	static {
		System.out.println("Executing the static block1");
		clg="RNSIT";
		principal="Venkatesh";
		
	}
	
	static {
		System.out.println("Executing the static block2");
		clg="SVP";
		principal="Keshav Murthy";
		
	}
	public  void method1() {
		// TODO Auto-generated method stub

	//	System.out.println("Executing the method1() of the Democlass");
		
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		/*System.out.println(clg);
		System.out.println(principal);
	*/
		int i=0;
		
		
	for (int j = 0; j <255; j++) {
		
		System.out.println(j+ " "+ i);
		
	}
		
		
			}
}
