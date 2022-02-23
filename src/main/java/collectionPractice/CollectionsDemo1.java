package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new ArrayList<>();
		
	l.add("A");
	l.add("H");
	l.add("T");
	l.add("Q");
	l.add("L");
	l.add("S");
	
	System.out.println(l);
	
	Collections.reverse(l);
	
	System.out.println(l);
	
	
	//Collections.sort(l);
	
	
	
	//System.out.println(Collections.binarySearch(l, "K"));
	
	
	//System.out.println(l);
		
	}

}
