package  interfaces;



public class Test_Class implements Test1{

	@Override
	public void Create_Client() {
		// TODO Auto-generated method stub
		System.out.println("Executing the Create_Client_Method");
	}

	@Override
	public void List_Client() {
		// TODO Auto-generated method stub
		System.out.println("Executing the List_Client_Method");
	}

	
	public static void main(String[] args) {
		
		Test_Class ref1=new Test_Class();
		ref1.Create_Client();
		ref1.List_Client();
		System.out.println(ref1.x1);
	}
}
