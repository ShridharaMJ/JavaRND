package  interfaceDemo;

public class DemoClassA implements DemoA,DemoB{

	
//x=339;
	
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("This is the MethodOne of  the Interfaces");
	}

	
	/*public static void main(String[] args) {
		new DemoClassA().methodOne();
		new DemoClassA().methodTwo("String", 89879);
		new DemoClassA().methodTwo(1098287, 98398);
	}*/


	@Override
	public void methodTwo(String name, int ds) {
		// TODO Auto-generated method stub
		System.out.println(name+ " "+ ds);
	}


	public void methodTwo(int num1, int num3) {
		// TODO Auto-generated method stub
		System.out.println(num1+" "+num3);
	}
	
    public static void main(String [] args) 
    {
    	DemoClassA p = new DemoClassA();
        p.start();
    }

    void start() 
    {
        long [] a1 = {3,4,5};
        long [] a2 = fix(a1);
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long [] fix(long [] a3) 
    {
        a3[1] = 7;
        return a3;
    }
	
}
