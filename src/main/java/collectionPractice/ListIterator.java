package collectionPractice;

import java.util.ArrayList;
import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			al.add(i);
			
		}
		
		System.out.println(al);
		
		
		  java.util.ListIterator itr = al.listIterator(5);
		  itr.add(100); 
			//itr.set(111);
		 while (itr.hasNext()) {
			 Integer in=(Integer)itr.next();
				System.out.println(in);
			
		}
		
		
		 
		 java.util.ListIterator itr1 = al.listIterator(5);
		 System.out.println("Prevoius Iterator");
		 while (itr1.hasPrevious()) {
			 Integer in=(Integer)itr1.previous();
				System.out.println(in);
			
			
		}
		
	}
	
}
