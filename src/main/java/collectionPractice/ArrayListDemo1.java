package collectionPractice;

import java.util.ArrayList;

public class ArrayListDemo1 {
	




	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList<>();
	al.add("A");
	al.add(10);
	al.add("A");
	al.add(null);
	System.out.println(al);
	
	al.remove("A");
	
	System.out.println(al);
	
	al.add(2, "B");
	al.add("M");
	System.out.println(al);
		
	}
	
}
