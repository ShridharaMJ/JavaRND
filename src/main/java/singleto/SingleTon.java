package  singleto;

public class SingleTon {

	private static SingleTon ref=null;
	
	private SingleTon() {
		
		super();
	}
	
	public static SingleTon getInstant() {
	
		if(ref==null)
		{
			ref=new SingleTon();
		}
		return ref;
		
	}
}
