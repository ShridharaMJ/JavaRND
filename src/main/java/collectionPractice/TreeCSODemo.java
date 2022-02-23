package collectionPractice;

import java.util.TreeMap;

public class TreeCSODemo {

	public static void main(String[] args) {
		
		TreeMap t=new TreeMap(new ComparatorDemo());
		t.put(100, "Kiran");
		t.put(109, "Mallesh");
		t.put(234, "Narendra");
		t.put(199, "AR");
		
		System.out.println(t);
	}
	
}
