package collectionPractice;

import java.util.Enumeration;
import java.util.Vector;

import sun.security.provider.VerificationProvider;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Vector v= new Vector<>();
		for (int i = 0; i <10; i++) {
			v.addElement(i);
		}
		
		System.out.println(v);
		
		Enumeration ele = v.elements();
		while(ele.hasMoreElements()) {
			Integer i = (Integer)ele.nextElement();
			System.out.println(i);
		}
		
	}
	
}
