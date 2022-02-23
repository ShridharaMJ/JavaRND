package collectionPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet hsref=new HashSet<>();    //Insertion order is not preserved
	//LinkedHashSet hsref=new LinkedHashSet<>(); //Insertion order is preserved
	
	hsref.add("Test1");
	hsref.add("Test2");
	hsref.add("Test3");
	hsref.add("Test4");
	hsref.add("Test5");
	hsref.add(null);
//	hsref.add(null);
	
	System.out.println(hsref);
	
	
	
}
}
